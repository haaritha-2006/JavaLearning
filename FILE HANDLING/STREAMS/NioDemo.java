import java.nio.file.*;

public class NioDemo {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("sample.txt");

        if (!Files.exists(path)) {
            Files.createFile(path);
            System.out.println("File created");
        }
    }
}
