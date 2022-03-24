package com.personal.toDoListApp.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public final class TimeVarianceAuthorityTerritoryRecords {
	private static final Set<String> TERRITORIES = new HashSet<>(Arrays.asList(
			new String("Earth"),
			new String("Asgard"),
			new String("Universe")
		));

	public final Set<String> getAllTerritories() {
		return TERRITORIES;
	}

}
