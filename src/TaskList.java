import java.util.ArrayList;

public class TaskList {
    public ArrayList<Task> taskList = new ArrayList<>();

    public void displayTaskList() {
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(i + 1 + " | " + taskList.get(i).getDescription());
        }
    }

    public void addTask(String description) {
        this.taskList.add(new Task(description));
    }

    public void updateTaskDescription(int taskId, String taskDescription) {
        this.taskList.get(taskId - 1).updateDescription(taskDescription);
    }

    public void updateTaskStatus(int taskId) {
        this.taskList.get(taskId - 1).updateStatus();
    }

    public void deleteTask(int taskId) {
        this.taskList.remove(taskId - 1);
    }
}
