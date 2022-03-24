package com.personal.toDoListApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public final class Superhero {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false, unique = true)
	private int superheroId;
	
	@Column(nullable = false, unique = true)
	private String superheroName;
	
	@Column(nullable = false)
	private String territory;
	
	public Superhero() {
		
	}
	
	public Superhero(String superhero, String territory) {
		this.superheroName = superhero;
		this.territory = territory;
	}
	
	public int getSuperheroId() {
		return superheroId;
	}

	public String getSuperheroName() {
		return superheroName;
	}

	public void setSuperheroName(String superheroName) {
		this.superheroName = superheroName;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	@Override
	public String toString() {
		return "Superhero [superheroId=" + superheroId + ", superheroName=" +superheroName + ", territory=" + territory
				+ "]";
	}
}
