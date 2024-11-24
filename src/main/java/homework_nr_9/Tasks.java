package homework_nr_9;

import java.util.ArrayList;

public class Tasks {

    public static ArrayList<String> getTodayTasks(){
        ArrayList tasks = new ArrayList<>();

        tasks.add("Cook breakfast");
        tasks.add("Go to work");
        tasks.add("Do a homework for JAVA after work");
        tasks.add("Go to Shop");
        tasks.add("Go to bed");

        return tasks;
    }

    public static void main(String[] args) {

        ArrayList<String> TodayTasks = getTodayTasks();

        System.out.println("TodayTasks:");
        for (String task :TodayTasks) {
            System.out.println(" " + task);
        }

    }

}
