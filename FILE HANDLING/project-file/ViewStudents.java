package project-file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ViewStudents {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error while reading file.");
        }
    }
}
