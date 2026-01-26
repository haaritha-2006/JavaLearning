import java.io.*;
public class FolderDeleteWithFilesOn {
    public static void main(String[] args) throws IOException {
        File mainfolder=new File("myfolder");
        mainfolder.exists();

    // THIS LOOPS THROGH FILES IN THE FOLDER

        for(File filesinside : mainfolder.listFiles()){

            //DELETE() METHOD
            filesinside.delete(); 
        }
    }
}
