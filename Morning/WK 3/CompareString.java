import java.util.Scanner;

public class CompareString
{
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);

        String storedPassword = "Akash@Gursi";
        String password;

        System.out.print("Please enter your password: ");
        password = keyInput.nextLine();

        if (storedPassword == password)
        {            
            System.out.print("\n Using == to compare the two passwords, gave us CORRECT comparisom");        
        }
        else
        {
            System.out.print("\n Using == to compare the two passwords, gave us WRONG comparisom");        

        }


        if (storedPassword.equals(password))
        {            
            System.out.print("\n Using [equal method] to compare the two passwords, gave us CORRECT comparisom");        
        }
        else
        {
            System.out.print("\n Using [equal method] to compare the two passwords, gave us WRONG comparisom");        

        }








    }
}
