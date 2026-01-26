package project-file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AddStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        String record = name + "," + age + "," + course;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt", true))) {
            bw.write(record);
            bw.newLine();
            System.out.println("Student record saved.");
        } catch (Exception e) {
            System.out.println("Error while writing to file.");
        }

        sc.close();
    }
}
