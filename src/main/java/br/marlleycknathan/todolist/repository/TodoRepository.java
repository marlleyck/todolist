package br.marlleycknathan.todolist.repository;

import br.marlleycknathan.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
