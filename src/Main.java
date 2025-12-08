import classes.TaskList;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main() {

        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        String newCommand;
        String command = "";

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

                newCommand = newCommand.substring(1);
            }

            switch(command) {
                case "add":
                    taskList.addTask(newCommand);
                    break;

                default:
                    System.out.println("no such command");
                    break;
            }

            // taskList.displayTaskList();

            command = "";

        }
    }
}
