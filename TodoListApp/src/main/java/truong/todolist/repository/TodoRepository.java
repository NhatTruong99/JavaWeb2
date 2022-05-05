package truong.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import truong.todolist.model.TodoItem;

@Repository
public interface TodoRepository extends JpaRepository<TodoItem, Long>{

}
