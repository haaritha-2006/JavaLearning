import java.io.*;
public class PracticeFile {
    public static void main(String[] args) {
        try{
            //FILE WRITER=WRITE()

            FileWriter fw=new FileWriter("details.txt");
            fw.write("Haaritha.S  B.E.,CSE");

            //APPEND AT END
            
            fw.append("\tThank you");
            fw.close();

            // FILE READER=READ()
            FileReader fr=new FileReader("details.txt");
            int c;

            //READ CHARACTER ONE AT A TIME

            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("error occured!");
        }
    }
}
