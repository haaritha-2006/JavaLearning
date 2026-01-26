import java.io.File;
import java.io.IOException;

public class FileFolderCreation {
    public static void main(String[] args) throws IOException {

        File f = new File("ttt.txt");
        File fold = new File("myfolder");

        System.out.println(f.createNewFile());  // true → created
        System.out.println(fold.mkdir());       // true → created
    }
}
// WHEN THIS CODE IS EXECUTED AGAIN AFTER CREATION , THEY ALREADY EXISTS
// SO RETURNS FALSE,FALSE
