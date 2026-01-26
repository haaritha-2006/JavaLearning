import java.io.*;

public class BufferedReadTryDemo {
    public static void main(String[] args) {

        // Try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
