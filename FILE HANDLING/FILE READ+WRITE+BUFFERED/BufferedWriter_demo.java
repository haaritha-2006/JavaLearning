import java.io.*;
public class BufferedWriter_demo {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("buffer.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Hello!");
    
// FLUSH() METHOD = SAVES DATA TO FILE IMMEDIATE BUFFER-->FILE 
            bw.flush();
            bw.newLine();
            bw.write("I'm Haaritha.");
            bw.close();
            System.out.println("Successfully written.");
        }catch(IOException e){
            System.out.println("error occured.");
        }
    }
}
