package se.lexicon.dao;

import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOCollectionImpl implements TodoItemDAO{

    private List<TodoItem> userStorage;
    private List<TodoItem> completedList;
    private List<TodoItem> overDueList;
    private List<TodoItem> notOverDueList = new ArrayList<TodoItem>();

    public TodoItemDAOCollectionImpl() {
        userStorage = new ArrayList<TodoItem>();
        completedList = new ArrayList<TodoItem>();
        overDueList = new ArrayList<TodoItem>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("TodoItem was null");
        TodoItem result = findById(todoItem.getId());
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : userStorage)
            if (todoItem.getId() == id)
                return todoItem;
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(Boolean done) {

        for (TodoItem todoItem : userStorage)
            if (todoItem.isDone())
                completedList.add(todoItem);

        return completedList;
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        for (TodoItem item : userStorage)
            if (item.getDeadLine() == date)
                notOverDueList.add(item);

        return notOverDueList;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        for (TodoItem todoItem : userStorage)
            if (todoItem.isOverDue())
                overDueList.add(todoItem);

        return  overDueList;
    }

    @Override
    public void remove(int id) {

    }
}