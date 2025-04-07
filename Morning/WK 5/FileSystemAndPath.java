//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
import java.nio.file.*;


public class FileSystemAndPath
{
    public static void main(String[] args) 
    {
        
        //TO retrieve the computer default path i.e the path where this java application is running from.
        FileSystem fileSys = FileSystems.getDefault();

        Path absoluterPathName = fileSys.getPath("").toAbsolutePath();
        System.out.println("\n-------------------------------------------");
        System.out.println(absoluterPathName);
        System.out.println("-------------------------------------------\n");


    }
}