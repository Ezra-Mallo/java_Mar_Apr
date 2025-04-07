import java.nio.file.*;
import java.nio.file.attribute.*;

public class GetFileAtrributes
{
    public static void main(String[] args) 
    {
        String pathName1 = "C:\\java\\Morning\\WK 5\\SWDV\\NWAD\\regedit.exe";
        //String pathName2 = "C:/java/Morning/WK 5/SWDV/NWAD/regedit.exe";
        Path myPath = Paths.get(pathName1);
        
        try
        {
            BasicFileAttributes basicFilAttrib =  Files.readAttributes(myPath,BasicFileAttributes.class);

            System.out.println("\n--------------------------------------------");

            long fileSize = basicFilAttrib.size();
            System.out.printf("FIle Size [%d] bytes", fileSize);
            System.out.println("\n--------------------------------------------");

            String crTime = basicFilAttrib.creationTime().toString();
            System.out.printf("Creation Date/Time :[%s].\n", crTime);
            System.out.println("--------------------------------------------");

            String lastModify = basicFilAttrib.lastModifiedTime().toString();
            System.out.printf("Date/Time last Modified :[%s]\n", lastModify);
            System.out.println("--------------------------------------------");

            boolean  regularFile = basicFilAttrib.isRegularFile();
            System.out.printf("Is a regular file?:[%B]\n", regularFile);
            System.out.println("--------------------------------------------");
            


        }
        catch(Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }


    
    }
}
