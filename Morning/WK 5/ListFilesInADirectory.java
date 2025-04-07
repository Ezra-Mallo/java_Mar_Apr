import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.io.IOException;

public class ListFilesInADirectory {
    public static void main(String[] args) 
    {
        String pathName1 = "C:\\java\\Morning\\WK 5\\SWDV\\NWAD";
        String pathName2 = "C:/java/Morning/WK 5/SWDV/NWAD";

        Path myPath = Paths.get(pathName2);

        try 
        {
        
        
            List<Path> fileList = Files.list(myPath).collect(Collectors.toList());
        
            for (int k = 0; k < fileList.size(); k++) 
            {
                System.out.println(fileList.get(k).getFileName());
            }
            System.out.println("-------------------------------------------");

        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}