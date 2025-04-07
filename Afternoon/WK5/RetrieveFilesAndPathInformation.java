
import java.nio.file.*;

public class RetrieveFilesAndPathInformation
{
    public static void main(String[] args) 
    {
        //C:\java\Afternoon\WK5\SWDV\NWAD
        String pathName1 = "C:\\java\\Afternoon\\WK5\\SWDV\\NWAD";
        String pathName2 = "C:/java/Afternoon/WK5/SWDV/NWAD";
        String pathName3;

        Path myPath = Paths.get(pathName2);
        pathName3 = myPath.toString();

        System.out.println("--------------------------------------------");
        System.out.println(pathName1);
        System.out.println(pathName2);
        System.out.println(pathName3);
        System.out.println("--------------------------------------------");

        //Retries the filename of the the current directory(i.e. last folder)
        Path fileName = myPath.getFileName();
        
        System.out.println("File name of the (Current folder) is "+ fileName);
        System.out.println("--------------------------------------------");
        
        int count = myPath.getNameCount();
        System.out.println("Total number of elements(folder) in this path is "+ count);
        System.out.println("--------------------------------------------");

        for(int k = 0; k< count ; k++)
        {
            Path result = myPath.getName(k);
            System.out.printf("Element/Folder Name at index [%d] is %s\n", k, result);        
        }
        System.out.println("--------------------------------------------");
        
    }
}

