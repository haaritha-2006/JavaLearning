import java.util.*;

public class todolist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] tasks = new String[10];
        int taskcount = 0;
        int choice = 0;
        System.out.println("TO DO LIST APP");
        System.out.println("MENU");
        do {
            System.out.println("\n1.ADD TASK \n2.VIEW TASK \n3.DELETE TASK \n4.EDIT TASK\n5..EXIT");
            System.out.println("Enter your choice:");
            choice = s.nextInt();
            s.nextLine();
            // ADD TASK
            if (choice == 1) {
                if (taskcount < tasks.length) {
                    System.out.println("Enter your task:");
                    tasks[taskcount] = s.nextLine();
                    taskcount++;
                    System.out.println("Task added");
                } else {
                    System.out.println("task full!");
                }
            }
            // VIEW TASK
            else if (choice == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < taskcount; i++) {
                    System.out.println((i + 1) + "." + tasks[i]);
                }
            }
            // DELETE TASK
            else if (choice == 3) {
                System.out.println("Enter the task to be removed:");
                int index = s.nextInt();
                if (index > 0 && index <= taskcount) {
                    for (int i = index - 1; i < taskcount - 1; i++) {
                        tasks[i] = tasks[i + 1];
                    }
                    tasks[taskcount - 1] = null;
                    taskcount--;
                    System.out.println("task deleted.");
                } else {
                    System.out.println("invalid task number");
                }
            }
            // EDIT TASK
            else if (choice == 4) {
                System.out.println("Enter the task to edit:");
                int index = s.nextInt();
                s.nextLine();
                if (index > 0 && index <= taskcount) {
                    System.out.println("Enter new task:");
                    String newtask = s.nextLine();
                    tasks[index - 1] = newtask;
                    System.out.println("Task updated successfully.");
                } else {
                    System.out.println("Invalid task number.");
                }
            }
            // EXIT TASK
            else if (choice == 5) {
                System.out.println("Exiting....Thank you!");
            } else {
                System.out.println("Invalid choice.please enter valid number");
            }
        } while (choice != 5);
        s.close();
    }
}
