package com.personal.toDoListApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public final class SuperheroTask {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(nullable = false, unique = true)
	private int taskId;
	
	@Column(nullable = false)
	private String title;
	
	private String shortDescription;
	
	private String detailedDescription;
	
	@Column(nullable = false)
	private LocalDate startedOn;
	
	private LocalDate finishedOn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "Superhero_ID")
	private Superhero associatedSuperhero;
	
	public SuperheroTask() {
		
	}
	
	public SuperheroTask(String title, 
			    String shortDescription, 
			    String detailedDescription, 
			    LocalDate startedOn,
			    LocalDate finishedOn,
			    Superhero associatedSuperhero) {
		this.title = title;
		this.shortDescription = shortDescription;
		this.detailedDescription = detailedDescription;
		this.startedOn = startedOn;
		this.finishedOn = finishedOn;
		this.associatedSuperhero = associatedSuperhero;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	public LocalDate getStartedOn() {
		return startedOn;
	}

	public void setStartedOn(LocalDate startedOn) {
		this.startedOn = startedOn;
	}

	public LocalDate getFinishedOn() {
		return finishedOn;
	}

	public void setFinishedOn(LocalDate finishedOn) {
		this.finishedOn = finishedOn;
	}

	public Superhero getAssociatedSuperhero() {
		return associatedSuperhero;
	}

	public void setAssociatedSuperhero(Superhero associatedSuperhero) {
		this.associatedSuperhero = associatedSuperhero;
	}

	@Override
	public String toString() {
		return "SuperheroTask [taskId=" + taskId + ", title=" + title + ", shortDescription=" + shortDescription
				+ ", detailedDescription=" + detailedDescription + ", startedOn=" + startedOn + ", finishedOn="
				+ finishedOn + ", associatedSuperhero=" + associatedSuperhero + "]";
	}
}
