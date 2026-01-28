import java.io.*;
public class OutputStreamDemo {
    public static void main(String[] args) {
        try{
            
        FileOutputStream fos=new FileOutputStream("target.txt");
        String line="hello how are you?";
        fos.write(line.getBytes());// string → bytes 
        fos.close();
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
}
