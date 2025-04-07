import java.util.Scanner;

public class OpenWindowsApp
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);

        System.out.println("Chose your application");
        System.out.println("1. Calculator");
        System.out.println("2. Notepad");
        System.out.println("3. Paint");
        System.out.print("Entet your choice (1-3):");
        int choice = s.nextInt();
        String myCommand="";

        if(choice == 1)
        {
            myCommand  = "calc";
        }
        else if (choice ==2)
        {
            myCommand  = "notepad";
        }        
        else if (choice ==3)
        {
            myCommand  = "mspaint";
        }
        

        try
        {
            Process proc = Runtime.getRuntime().exec(myCommand);
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
        }
        
     
        

        

    }
}