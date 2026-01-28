// this program reads from a source file and then copy data 
// from source to target2

import java.io.*;
public class OverallStream {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("source.txt");
    FileOutputStream fos=new FileOutputStream("target2.txt",true)){
        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("successfully copied.");
    }catch(IOException e){
        System.out.println(e);
    }
    }
}
