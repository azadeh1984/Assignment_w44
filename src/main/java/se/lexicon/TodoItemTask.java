package se.lexicon;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public int getId() {
        return id;}

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;}

    public boolean isAssigned() {
        return assigned;}

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;}

    public TodoItem getTodoItem() {
        return todoItem;}

    public void setAssignee(Person assignee) {
        this.assignee = assignee;}

    public Person getAssignee() {
        return assignee;}

}
