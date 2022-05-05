package truong.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import truong.todolist.model.TodoItem;

import truong.todolist.service.TodoService;

@RestController
@RequestMapping("/todo")

public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/todolist", method=RequestMethod.GET)
	public List<TodoItem> findAll(){
		return todoService.getTodoList();
	}
	
	@RequestMapping(value="/todolist", method=RequestMethod.POST)
	public TodoItem save(@RequestBody TodoItem todoItem) {
		return todoService.createTodoItem(todoItem);
	}
}
