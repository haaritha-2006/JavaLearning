import java.io.*;
public class fileclass {
    public static void main(String[] args) {
    //  File f=new File("sample.txt");------------- FILE
     File f=new File("Project-file");  //FOLDER NAME
     System.out.println(f.exists());
     System.out.println(f.isDirectory());
     System.out.println(f.isFile());
    }
}
