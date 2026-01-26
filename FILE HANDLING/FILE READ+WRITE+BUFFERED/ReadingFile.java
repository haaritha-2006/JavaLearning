import java.io.*;

public class ReadingFile {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("sample.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
