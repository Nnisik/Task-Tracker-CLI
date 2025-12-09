import classes.TaskList;

import java.util.Scanner;

public class Main {
    static void main() {

        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        String newCommand;
        String command = "";

        int index;

        while (true) {
            System.out.print("task-cli ");
            newCommand = scanner.nextLine();

            if (newCommand.equals("list")) {
                taskList.displayTaskList();
            }
            else {

                int i = 0;

                while (newCommand.charAt(i) != ' ') {
                    command += newCommand.charAt(i);
                    newCommand = newCommand.substring(1);
                }

                switch(command) {
                    case "add":
                        taskList.addTask(newCommand);
                        break;

                    case "update":
                        index = Integer.parseInt(String.valueOf(newCommand.charAt(1)));
                        String newDescription = newCommand.substring(2);
                        taskList.updateTaskDescription(index, newDescription);
                        break;

                    case "delete":
                        index = Integer.parseInt(String.valueOf(newCommand.charAt(1)));
                        taskList.deleteTask(index);
                        break;

                    case "mark-in-progress":
                        index = Integer.parseInt(String.valueOf(newCommand.charAt(1)));
                        taskList.updateTaskStatus(index, "in progress");
                        break;

                    case "mark-done":
                        index = Integer.parseInt(String.valueOf(newCommand.charAt(1)));
                        taskList.updateTaskStatus(index, "done");
                        break;

                    case "list":
                        String status = newCommand.substring(1, newCommand.length());
                        taskList.displayTaskList(status);
                        break;

                    default:
                        System.out.println("no such command");
                        System.out.println(command);
                        break;
                }
            }

            command = "";

        }
    }
}
