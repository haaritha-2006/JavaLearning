import java.io.*;
public class BufferedReader_demo {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("buffer.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("success");
        }catch(IOException e){
            System.out.println("error ocuured");
        }
    }
}
