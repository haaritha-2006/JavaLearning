import java.io.File;
import java.io.IOException;

public class  creatingFile{
    public static void main(String[] args) {

        try {
            File f = new File("sample.txt");

            f.createNewFile();

            System.out.println("File work done");

        } catch (IOException e) {
            System.out.println("Problem while creating file");
        }
    }
}
