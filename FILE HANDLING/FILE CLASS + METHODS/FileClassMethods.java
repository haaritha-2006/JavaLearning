import java.io.File;
import java.io.IOException;

public class FileClassMethods {
    public static void main(String[] args) throws IOException {


 // 1️⃣ Create main file and folder
        File mainFile = new File("myfile.txt");
        File mainFolder = new File("myfolder");


// 2️⃣ Create if not exists
        if(!mainFile.exists()) mainFile.createNewFile();   // exists(), createNewFile()
        if(!mainFolder.exists()) mainFolder.mkdir();      // exists(), mkdir()

        
// 3️⃣ File info methods
        mainFile.exists();          // check if file exists
        mainFile.isFile();          // check if it's a file
        mainFile.isDirectory();     // check if it's a folder
        mainFile.getName();         // get file name
        mainFile.getAbsolutePath(); // get full path
        mainFile.length();          // get file size


// 4️⃣ Folder info methods
        mainFolder.exists();
        mainFolder.isDirectory();
        mainFolder.isFile();
        mainFolder.getName();
        mainFolder.getAbsolutePath();


// 5️⃣ Create sample files inside folder
        File f1 = new File(mainFolder, "file1.txt");
        File f2 = new File(mainFolder, "file2.txt");
        if(!f1.exists()) f1.createNewFile();
        if(!f2.exists()) f2.createNewFile();


// 6️⃣ Delete files inside folder using for-each + listFiles()
        for(File fileInside : mainFolder.listFiles()) fileInside.delete();


// 7️⃣ Delete folder and main file
        mainFolder.delete();
        mainFile.delete();


// 8️⃣ Rename example (commented out, just for reference)
        mainFile.renameTo(new File("newfile.txt")); // renameTo()
    }
}
