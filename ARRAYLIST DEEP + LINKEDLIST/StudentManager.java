import java.util.ArrayList;
import java.util.Scanner;

// Student class to store ID and Name
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList to store references to Student objects
        ArrayList<Student> students = new ArrayList<>();

        // -------------------------------
        // Step 1: Add students dynamically
        // -------------------------------
        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Name: ");
            String name = sc.nextLine();

            // Add new Student object reference to ArrayList
            students.add(new Student(id, name));
        }

        // -------------------------------
        // Step 2: Display all students
        // -------------------------------
        System.out.println("\nAll students:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name); // Access via reference
        }

        // -------------------------------
        // Step 3: Modify a student via reference
        // -------------------------------
        System.out.print("\nEnter index of student to modify name (0-based): ");
        int index = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (index >= 0 && index < students.size()) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            // Modify original object via reference
            students.get(index).name = newName;
        }

        // -------------------------------
        // Step 4: Replace a student using set()
        // -------------------------------
        System.out.print("\nEnter index of student to replace (0-based): ");
        int replaceIndex = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (replaceIndex >= 0 && replaceIndex < students.size()) {
            System.out.print("Enter new student ID: ");
            int newId = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.print("Enter new student Name: ");
            String newName = sc.nextLine();

            // Replace reference in ArrayList with new object
            students.set(replaceIndex, new Student(newId, newName));
        }

        // -------------------------------
        // Step 5: Remove a student
        // -------------------------------
        System.out.print("\nEnter index of student to remove (0-based): ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < students.size()) {
            // Remove reference from ArrayList
            students.remove(removeIndex);
        }

        // -------------------------------
        // Step 6: Display final list of students
        // -------------------------------
        System.out.println("\nFinal students:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }

        sc.close();
    }
}
