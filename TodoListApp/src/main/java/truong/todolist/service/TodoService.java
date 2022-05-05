package truong.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import truong.todolist.model.TodoItem;
import truong.todolist.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepo;
	 
	// CREATE 
	 public TodoItem createTodoItem(TodoItem todo) {
	     return todoRepo.save(todo);
	 }

	 // READ
	 public List<TodoItem> getTodoList() {
	     return todoRepo.findAll();
	 }

	 // DELETE
	 public void deleteTodoItem(Long todoId) {
		 todoRepo.deleteById(todoId);
	 }
}
