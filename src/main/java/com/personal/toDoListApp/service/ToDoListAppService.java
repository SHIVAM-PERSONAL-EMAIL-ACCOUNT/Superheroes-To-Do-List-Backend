package com.personal.toDoListApp.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.toDoListApp.model.TimeVarianceAuthoritySuperheroRecords;
import com.personal.toDoListApp.model.TimeVarianceAuthorityTerritoryRecords;

@Service
public final class ToDoListAppService {
	@Autowired
	private TimeVarianceAuthoritySuperheroRecords timeVarianceAuthoritySuperheroRecords;
	@Autowired
	private TimeVarianceAuthorityTerritoryRecords timeVarianceAuthorityTerritoryRecords;
	
	public final Set<String> getAllSuperheroesInTvaDatabase() {
		return timeVarianceAuthoritySuperheroRecords.getAllSuperheroes();
	}
	
	public final Set<String> getAllTerritoriesInTvaDatabase() {
		return timeVarianceAuthorityTerritoryRecords.getAllTerritories();
	}
}
