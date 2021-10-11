package com.todoapi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapi.api.model.tasks;
import com.todoapi.api.repository.TasksRepository;

import lombok.var;

@RestController
@RequestMapping("/api/v1/tasks")
@CrossOrigin(origins = "*")
public class TasksController {
	
	@Autowired
	private final TasksRepository TasksRepository;
	
	public TasksController(TasksRepository TasksRepository) {
		this.TasksRepository = TasksRepository;
	}
	
	@GetMapping
	public List<tasks> index() {
		return this.TasksRepository.findAll();
	}
	
	@GetMapping("/{Rfrnc}")
	public Optional<tasks> get(@PathVariable("Rfrnc") Long Rfrnc) {
		Optional<tasks> task = TasksRepository.findById(Rfrnc);
		return task;
	}
	
	
	@PostMapping
	public tasks create(@RequestBody tasks tasks) {
		return this.TasksRepository.save(tasks);
	}
	
	@PutMapping("/{Rfrnc}")
	public Optional<tasks> update(@PathVariable("Rfrnc") Long Rfrnc, @RequestBody tasks updated) {		
		return this.TasksRepository.findById(Rfrnc).map(oldTask->this.TasksRepository.save(updated));
	}
	
	@DeleteMapping("/{Rfrnc}")
	public void delete(@PathVariable("Rfrnc") Long Rfrnc) {
		this.TasksRepository.deleteById(Rfrnc);
	}
}
