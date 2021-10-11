package com.todoapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapi.api.model.tasks;
import com.todoapi.api.repository.TasksRepository;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin(origins = "*")
public class TasksController {
	
	@Autowired
	private final TasksRepository TasksRepository;
	
	public TasksController(TasksRepository TasksRepository) {
		this.TasksRepository = TasksRepository;
	}
	
	@PostMapping
	public tasks create(@RequestBody tasks tasks) {
		return this.TasksRepository.save(tasks);
	}
}
