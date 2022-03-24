package com.personal.toDoListApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.personal.toDoListApp.exceptionHandling.exceptions.SuperheroNotFoundException;
import com.personal.toDoListApp.model.Superhero;
import com.personal.toDoListApp.service.SuperheroService;

@RestController
@RequestMapping(path = "superheroes-api/v1/superheroes/")
public final class SuperheroController {
	@Autowired
	private SuperheroService superheroService;
	
	@PostMapping("hero")
	public final Superhero registerSuperhero(@RequestBody Superhero newSuperhero) {
		try {
			Superhero registeredSuperhero = superheroService.registerSuperhero(newSuperhero);
			return registeredSuperhero;
		} catch (DataIntegrityViolationException ex) {
			throw new DataIntegrityViolationException(String.format("%s has already been registered", newSuperhero.getSuperheroName()));
		}
	}
	
	@GetMapping("hero")
	public final Superhero getSuperhero(@RequestParam(required = true, name = "name") String superheroName) {
		Superhero registeredSuperhero = superheroService.getSuperhero(superheroName);
		if (registeredSuperhero == null) throw new SuperheroNotFoundException(String.format("%s is not a registered superhero", superheroName));
		return registeredSuperhero;
	}
	
	@PutMapping("hero/territory")
	public final void updateSuperheroTerritory(@RequestParam(required = true, name = "superheroID") int superheroID, 
											   @RequestParam(required = true, name = "newTerritory") String newTerritory) {
		superheroService.updateSuperheroTerritory(superheroID, newTerritory);
	}
	
	@DeleteMapping("hero")
	public final void deleteSuperhero(@RequestParam(required = true, name = "superheroID") int superheroID) {
		superheroService.deleteSuperheroById(superheroID);
	}
}
