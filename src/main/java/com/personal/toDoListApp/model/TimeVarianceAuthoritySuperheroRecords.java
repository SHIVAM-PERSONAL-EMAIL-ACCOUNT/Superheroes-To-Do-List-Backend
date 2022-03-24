package com.personal.toDoListApp.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public final class TimeVarianceAuthoritySuperheroRecords {
	private static final Set<String> SUPERHEROES = new HashSet<>(Arrays.asList(
				new String("Iron Man"),
				new String("Captain America"),
				new String("Hulk"),
				new String("Thor"),
				new String("Hawkeye"),
				new String("Black Widow")
			));
	
	public final Set<String> getAllSuperheroes() {
		return SUPERHEROES;
	}
}
