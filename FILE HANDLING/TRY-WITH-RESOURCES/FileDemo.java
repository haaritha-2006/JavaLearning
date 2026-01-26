import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("data.txt")){
            fw.write("Hello");
        }catch(IOException e){
            System.out.println("error occured");
        }
    }   
}