package classes;

import java.util.ArrayList;

public class TaskList {
    public ArrayList<Task> taskList = new ArrayList<>();

    public void displayTaskList() {

        if (taskList.isEmpty()) {
            System.out.println("no task created");
        }
        else {
            for (int i = 0; i < taskList.size(); i++) {
                System.out.print(i + 1 + " | " + taskList.get(i).getDescription() + " | ");
                System.out.println(taskList.get(i).getStatus());
            }
        }
    }

    public void displayTaskList(String status) {
        if (taskList.isEmpty()) {
            System.out.println("no task created");
        }
        else {
            TaskList resultTaskList = new TaskList();

            for (Task task: this.taskList) {
                if (task.getStatus().equals(status)) {
                    resultTaskList.addTask(task);
                }
            }

            resultTaskList.displayTaskList();
        }
    }

    public void addTask(String description) {
        this.taskList.add(new Task(description));
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    public void updateTaskDescription(int taskId, String taskDescription) {
        try {
            this.taskList.get(taskId - 1).updateDescription(taskDescription);
        }
        catch(Exception e) {
            System.out.println("Error accured. Check if needed task exist.");
        }
    }

    public void updateTaskStatus(int taskId, String newStatus) {
        this.taskList.get(taskId - 1).updateStatus(newStatus);
    }

    public void deleteTask(int taskId) {
        try {
            this.taskList.remove(taskId - 1);
        }
        catch(Exception e) {
            System.out.println("Error accured. Check if needed task exist.");
        }
    }
}
