package todoapp;

public class ToDoApplication {
    private String id;
    private String task;

    public ToDoApplication(String id, String task) {
        this.id = id;
        this.task = task;
    }

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return id + ": " + task + "";
    }
}
