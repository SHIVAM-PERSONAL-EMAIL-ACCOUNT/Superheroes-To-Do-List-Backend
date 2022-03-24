package com.personal.toDoListApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.toDoListApp.model.SuperheroTask;
import com.personal.toDoListApp.repository.SuperheroTaskRepository;

@Service
public final class SuperheroTaskService {
	@Autowired
	private SuperheroTaskRepository superheroTaskRepository;
	
	public final void createSuperheroTask(SuperheroTask newSuperheroTask) {
		superheroTaskRepository.save(newSuperheroTask);
	}
	
	public final void updateSuperheroTaskDetails(SuperheroTask newSuperheroTaskDetails) {
		SuperheroTask taskToBeUpdated = superheroTaskRepository.getById(newSuperheroTaskDetails.getTaskId());
		taskToBeUpdated.setTitle(newSuperheroTaskDetails.getTitle());
		taskToBeUpdated.setShortDescription(newSuperheroTaskDetails.getShortDescription());
		taskToBeUpdated.setDetailedDescription(newSuperheroTaskDetails.getDetailedDescription());
		taskToBeUpdated.setFinishedOn(newSuperheroTaskDetails.getFinishedOn());
		superheroTaskRepository.save(taskToBeUpdated);
	}
	
	public final void deleteSuperheroTaskById(int superheroTaskID) {
		superheroTaskRepository.deleteById(superheroTaskID);
	}
	
	public final List<SuperheroTask> getOpenTasksOfSuperhero(int superheroID) {
		return superheroTaskRepository.findOpenTasksOfSuperhero(superheroID);
	}
	
	public final List<SuperheroTask> getClosedTasksOfSuperhero(int superheroID) {
		return superheroTaskRepository.findClosedTasksOfSuperhero(superheroID);
	}
	
	public final List<SuperheroTask> getAllTasksOfSuperhero(int superheroID) {
		return superheroTaskRepository.findAllTasksOfSuperhero(superheroID);
	}
}
