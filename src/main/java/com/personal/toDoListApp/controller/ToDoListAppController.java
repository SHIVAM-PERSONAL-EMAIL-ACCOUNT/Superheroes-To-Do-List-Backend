package com.personal.toDoListApp.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.toDoListApp.service.ToDoListAppService;

@RestController
@RequestMapping(path = "superheroes-api/v1/")
public final class ToDoListAppController {
	@Autowired
	private ToDoListAppService toDoListAppService;
	
	@GetMapping("all-superheroes")
	public final Set<String> getAllSuperheroesInTvaDatabase() {
		return toDoListAppService.getAllSuperheroesInTvaDatabase();
	}
	
	@GetMapping("all-territories")
	public final Set<String> getAllTerritoriesInTvaDatabase() {
		return toDoListAppService.getAllTerritoriesInTvaDatabase();
	}
}
