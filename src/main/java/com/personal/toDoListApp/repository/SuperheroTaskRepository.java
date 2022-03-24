package com.personal.toDoListApp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.personal.toDoListApp.model.SuperheroTask;

@Repository
public interface SuperheroTaskRepository extends JpaRepository<SuperheroTask, Integer> {
	@Query(
			value = "SELECT * FROM superhero_Task st WHERE st.superhero_ID = ?1 ORDER BY started_on DESC",
			nativeQuery = true
		  )
	List<SuperheroTask> findAllTasksOfSuperhero(int superheroID);
	@Query(
			value = "SELECT * FROM superhero_Task st WHERE st.superhero_ID = ?1 AND finished_On = null ORDER BY started_on DESC",
			nativeQuery = true
		  )
	List<SuperheroTask> findOpenTasksOfSuperhero(int superheroID);
	@Query(
			value = "SELECT * FROM superhero_Task st WHERE st.superhero_ID = ?1 AND finished_On != null ORDER BY started_on DESC",
			nativeQuery = true
		  )
	List<SuperheroTask> findClosedTasksOfSuperhero(int superheroID);
}
