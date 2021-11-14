package main;

import jdk.swing.interop.SwingInterOpUtils;
import todoapp.Schedule;
import todoapp.ToDoApplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Add");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Exit");

        String task = scanner.next();

        Schedule scheduleList = new Schedule();
        int taskCounter = 1;

        do {

            if (task.equals("1")) {
                System.out.println("Add your new task!");
                String addTask = scanner.next();
                scheduleList.addTask(String.valueOf(taskCounter), new ToDoApplication(addTask));
            } else if (task.equals("2")) {
                System.out.println("Pick up task you want to edit!");
                String taskNuber = scanner.next();
                System.out.println("Choose new task to be replaced by old one: ");
                String improvedTask = scanner.next();
                scheduleList.updateTask(taskNuber, new ToDoApplication(improvedTask));
            }

        } while(!task.equals("4"));
    }
}
