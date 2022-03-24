package com.personal.toDoListApp.exceptionHandling.controllerAdvice;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.personal.toDoListApp.exceptionHandling.exceptions.SuperheroNotFoundException;

@ControllerAdvice
public final class SuperheroesApiExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public final ResponseEntity<Object> handleDuplicateRegistration(RuntimeException ex, WebRequest wr) {
		return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST, wr); 
	}
	
	@ExceptionHandler(value = SuperheroNotFoundException.class)
	public final ResponseEntity<Object> handleInvalidSuperheroRequest(RuntimeException ex, WebRequest wr) {
		return handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, wr); 
	}
}
