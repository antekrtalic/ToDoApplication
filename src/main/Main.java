package main;

import jdk.swing.interop.SwingInterOpUtils;
import todoapp.Schedule;
import todoapp.ToDoApplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ToDoApplication toDoTaskOne = new ToDoApplication("study");
        ToDoApplication toDoTaskTwo = new ToDoApplication("work");
        ToDoApplication toDoTaskThree = new ToDoApplication("read");

        Schedule schedule = new Schedule();
        System.out.println("SCHEDULE LIST");
        System.out.println("------------------------");
        schedule.addTask("1", toDoTaskOne);
        schedule.addTask("2", toDoTaskTwo);
        schedule.addTask("3", toDoTaskThree);
        schedule.printTasks();

        System.out.println("Remove something from list");
        String removeID = scanner.next();
        schedule.removeTask(removeID);
        schedule.printTasks();

    }
}
