package com.personal.toDoListApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.toDoListApp.model.Superhero;

@Repository
public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {
	Superhero findBySuperheroName(String superheroName);
}
