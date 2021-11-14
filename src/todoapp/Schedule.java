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
        for (String task : toDoThings.keySet()) {
            if (task.equals(id)) {
                this.toDoThings.remove(id);
                return;
            }
        }
    }

    public void updateTask(String id, ToDoApplication newTask) {
        for (String task : toDoThings.keySet()) {
            if (task.equals(id)) {
                toDoThings.replace(task, newTask);
                return;
            }
        }
    }

    public void printTasks() {
        for (String i : this.toDoThings.keySet()) {
            System.out.println(i + ": " + toDoThings.get(i));
        }
    }

}
