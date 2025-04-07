import java.nio.file.*;

public class RetrieveFilesAndPathInformation
{
    public static void main(String[] args) 
    {
        String pathName1, pathName2;
        pathName1 = "C:\\java\\Morning\\WK 5\\SWDV\\NWAD";

        //Instace of Path
        Path myPath = Paths.get(pathName1);

        
        System.out.println("-------------------------------------------");
        pathName2 = myPath.toString();
        System.out.println(pathName1);
        System.out.println(pathName2);
        System.out.println("-------------------------------------------");
        

        //retrieve the file name of the current or directory 
        Path fileName = myPath.getFileName();
        System.out.println("File name of (Current folder) is " + fileName);
        System.out.println("-------------------------------------------");
        


        int  count  = myPath.getNameCount();
        System.out.printf("Total number of element in this path [%s] is %d\n", pathName2 , count);
        System.out.println("-------------------------------------------");
        
        for (int k = 0; k < count; k++)
        {
            Path result = myPath.getName(k);
            System.out.printf("Name element at index [%d] is %s\n", k , result);
            
        }



    }
}