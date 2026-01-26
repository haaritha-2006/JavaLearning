import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Hello Java");

            fw.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("Error while writing file");
        }
    }
}
