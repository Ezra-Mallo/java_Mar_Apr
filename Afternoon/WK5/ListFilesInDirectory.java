import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.List;

public class ListFilesInDirectory
{
    public static void main(String[] args) 
    {
        String pathName1 = "C:\\java\\Afternoon\\WK5\\SWDV\\NWAD";
        String pathName2 = "C:/java/Afternoon/WK5/SWDV/NWAD";
        
        Path myPath = Paths.get(pathName1);
        try
        {
            List<Path> fileList = Files.list(myPath).collect(Collectors.toList());
            
            int max = fileList.size();
            System.out.println("\n--------------------------------------------");
            for (int k = 0; k < max; k++)
            {
                String myFile = fileList.get(k).getFileName().toString();
                System.out.printf("[%d.] %s\n",(k+1), myFile);
            }
            System.out.println("--------------------------------------------\n");

        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }


    }    
}