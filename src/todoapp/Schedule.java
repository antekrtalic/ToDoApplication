package todoapp;


import java.util.HashMap;

public class Schedule {
    private HashMap<String, ToDoApplication> toDoThings;

    public Schedule() {
        toDoThings = new HashMap<String, ToDoApplication>();
    }

    public void addTask(String id, ToDoApplication toDoTask) {
        toDoThings.put(id, toDoTask);
    }

    public void removeTask(String id) {
        for (String task : this.toDoThings.keySet()) {
            if (task.equals(id)) {
                this.toDoThings.remove(id);
                return;
            }
        }
    }

    public void printTasks() {
        for (String i : this.toDoThings.keySet()) {
            System.out.println(i + ": " + this.toDoThings.get(i));
        }
    }
}
