//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
//import java.nio.file.Path;
//import java.nio.file.Paths;

import java.nio.file.*;



public class FileSystemAndPath
{
    public static void main(String[] args) 
    {
        FileSystem fileSys = FileSystems.getDefault();

        Path absolutPathName = fileSys.getPath("").toAbsolutePath();
        
        
        System.out.println("\n-----------------------------------");
        System.out.println(absolutPathName);
        System.out.println("-----------------------------------\n");


        
    }

}