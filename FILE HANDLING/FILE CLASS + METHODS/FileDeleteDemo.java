import java.io.File;

public class FileDeleteDemo {
    public static void main(String[] args) {

        File file = new File("ttt.txt");
        File folder = new File("myfolder");

        System.out.println(file.delete());   // true → deleted
        System.out.println(folder.delete()); // true → deleted only if empty
    }
}
