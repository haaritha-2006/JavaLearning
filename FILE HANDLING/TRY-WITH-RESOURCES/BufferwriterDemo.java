import java.io.*;

public class BufferwriterDemo {
    public static void main(String[] args) {

        try (BufferedWriter bw =
                 new BufferedWriter(new FileWriter("buffer.txt"))) {

            bw.write("Hello");
            bw.newLine();
            bw.write("Java");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
