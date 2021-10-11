package com.todoapi.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapi.api.model.tasks;

public interface TasksRepository extends JpaRepository<tasks, Long> {
	
}
