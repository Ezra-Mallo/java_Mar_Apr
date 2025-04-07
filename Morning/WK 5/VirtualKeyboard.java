import java.util.*;

public class VirtualKeyboard 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        try 
        {
            String[] myCommand = {"cmd", "/c", "C:\\Windows\\System32\\osk.exe"};
            //String[] myCommand = {"cmd", "/c", "osk"};  // This will also wok=rk. No need for .exe explicitly
            
            Process process = Runtime.getRuntime().exec(myCommand);
        } 
        catch (java.io.IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Enter the name: ");
        String name = s.nextLine();
        System.out.println("\nHello " + name);

        s.close();  // Close Scanner to avoid resource leak
    }
}
