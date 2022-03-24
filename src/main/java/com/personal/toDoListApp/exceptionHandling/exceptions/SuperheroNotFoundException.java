package com.personal.toDoListApp.exceptionHandling.exceptions;

public final class SuperheroNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 7540032444895460669L;
	
	public SuperheroNotFoundException(String message) {
		super(message);
	}
}
