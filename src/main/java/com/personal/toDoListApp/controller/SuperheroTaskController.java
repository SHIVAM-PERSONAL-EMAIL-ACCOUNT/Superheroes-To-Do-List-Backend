package com.personal.toDoListApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.personal.toDoListApp.model.SuperheroTask;
import com.personal.toDoListApp.service.SuperheroTaskService;

@RestController
@RequestMapping(path = "SuperheroesApi/v1/tasks/")
public final class SuperheroTaskController {
	@Autowired
	private SuperheroTaskService superheroTaskService;
	
	@PostMapping("task")
	public final void createSuperheroTask(@RequestBody SuperheroTask newSuperheroTask) {
		superheroTaskService.createSuperheroTask(newSuperheroTask);
	}
	
	@PutMapping("task-details")
	public final void updateSuperheroTaskDetails(@RequestBody SuperheroTask newSuperheroTaskDetails) {
		superheroTaskService.updateSuperheroTaskDetails(newSuperheroTaskDetails);
	}
	
	@DeleteMapping("task")
	public final void deleteSuperheroTaskById(@RequestParam(required = true, name = "taskID") int superheroTaskID) {
		superheroTaskService.deleteSuperheroTaskById(superheroTaskID);
	}
	
	@GetMapping("open-tasks")
	public final List<SuperheroTask> getOpenTasksOfSuperhero(@RequestParam(required = true, name = "superheroID") int superheroID) {
		return superheroTaskService.getOpenTasksOfSuperhero(superheroID);
	}
	
	@GetMapping("closed-tasks")
	public final List<SuperheroTask> getClosedTasksOfSuperhero(@RequestParam(required = true, name = "superheroID") int superheroID) {
		return superheroTaskService.getClosedTasksOfSuperhero(superheroID);
	}
	
	@GetMapping("all-tasks")
	public final List<SuperheroTask> getAllTasksOfSuperhero(@RequestParam(required = true, name = "superheroID") int superheroID) {
		return superheroTaskService.getAllTasksOfSuperhero(superheroID);
	}
}
