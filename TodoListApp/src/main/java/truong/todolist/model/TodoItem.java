package truong.todolist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todolist")
public class TodoItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(nullable = false, length = 100)
	private String title;
    @Column(nullable = false)
	private boolean done;
	
	public TodoItem(Long id, String title, boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.done = done;
	}

	public TodoItem() {
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isDone() {
		return done;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
}
