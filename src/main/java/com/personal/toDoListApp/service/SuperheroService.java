package com.personal.toDoListApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.toDoListApp.model.Superhero;
import com.personal.toDoListApp.repository.SuperheroRepository;

@Service
public final class SuperheroService { 
	@Autowired
	private SuperheroRepository superheroRepository;
	
	public final Superhero registerSuperhero(Superhero newSuperhero) {
		return superheroRepository.save(newSuperhero);
	}
	
	public final Superhero getSuperhero(String superheroName) {
		return superheroRepository.findBySuperheroName(superheroName);
	}
	
	public final void updateSuperheroTerritory(int superheroId, String newTerritory) {
		Superhero registeredSuperhero = superheroRepository.getById(superheroId);
		registeredSuperhero.setTerritory(newTerritory);
		superheroRepository.save(registeredSuperhero);
	}
	
	public final void deleteSuperheroById(int superheroId) {
		superheroRepository.deleteById(superheroId);
	}
}
