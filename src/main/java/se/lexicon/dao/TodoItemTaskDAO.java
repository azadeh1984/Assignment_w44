package se.lexicon.dao;

import se.lexicon.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {
    TodoItemTask persist(TodoItemTask person);
    TodoItemTask findById(int id);
    List<TodoItemTask> findAll();
    List<TodoItemTask> findAllByAssignedStatus(Boolean status);
    List<TodoItemTask>findByPersonId(int personId);
    void remove(int id);
}
