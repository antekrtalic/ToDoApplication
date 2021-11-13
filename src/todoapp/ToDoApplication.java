package todoapp;

public class ToDoApplication {
    private String task;

    public ToDoApplication(String task) {
        this.task = task;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return task;
    }
}
