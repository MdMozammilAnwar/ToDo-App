/**
 * 
 */
package com.moz.sb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moz.sb.model.ToDo;
import com.moz.sb.repository.ToDoRepository;

/**
 * @author Md Mozammil Anwar Quadri
 *
 */
@RestController
@CrossOrigin
public class ToDoController {
//	Initialized repository
	@Autowired
	private ToDoRepository toDoRepository;
//	method to save the todo
	@PostMapping("/todo")
	@Transactional
	public ToDo saveToDo(@RequestBody ToDo todo) {
  	ToDo savedToDo = toDoRepository.save(todo);
		return savedToDo;
	}
//	fetch all todo list
	@GetMapping("/todo")
	public List<ToDo> getToDo()
	{
		List<ToDo> todos = toDoRepository.findAll();
		return todos;
	}
//	to delete the todo
	@DeleteMapping("/todo/{id}")
	@Transactional
	public void deleteTodo(@PathVariable("id") Integer id)
	{
		toDoRepository.deleteById(id);
	}
}
