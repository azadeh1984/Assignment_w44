package se.lexicon;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadline;
    private boolean done;

    private Person creator;
    private LocalDate deadLine;

    public TodoItem() {

        this.deadLine = LocalDate.of(2022, 11, 30);
    }


    //public void setId(int id){this.id= id;}
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("Title param was null");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setDeadline(LocalDate deadline) {
        if (deadline == null) throw new IllegalArgumentException("Deadline param was null");
        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }


    public Person getCreator() {
        return creator;
    }

    public String getSummary() {
        return creator.personInformation();


    }

    public boolean isOverDue() {
        LocalDate currentTime = LocalDate.now();
        if (currentTime.isAfter(deadLine)) {
            return true;
        } else {
            return false;
        }

    }

}