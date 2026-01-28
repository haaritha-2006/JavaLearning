import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("source.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
