import java.io.IOException;
import java.util.Scanner;

public class VirtualKeyboardDemo
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        try
        {
            //Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\osk.exe");

            //String myCommand = "cmd /c C:\\Windows\\System32\\osk.exe"; 
            
            String[] myCommand = {"cmd", "/c", "C:/Windows/System32/osk.exe"};
            //String[] myCommand = {"cmd", "\\c", "C:\\Windows\\System32\\osk.exe"};
            Process proc = Runtime.getRuntime().exec(myCommand);



        }
        catch(IOException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.print("Enter your name:");
        String name= s.nextLine();
        System.out.println("Hello " + name + "!");
    }
}