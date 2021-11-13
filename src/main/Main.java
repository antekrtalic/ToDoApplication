package main;

import todoapp.ToDoApplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String task = scanner.next();
        ToDoApplication toDoTask = new ToDoApplication(String.valueOf(i), task);
        System.out.println(toDoTask.toString());


    }
}
