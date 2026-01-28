import java.io.*;

public class CopyBinaryFile {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("img.jpg");
            FileOutputStream fos = new FileOutputStream("copy.jpg")) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b); // copy each byte
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
