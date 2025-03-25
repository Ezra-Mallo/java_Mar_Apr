import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        String storedPassword = "Amrit@Martin5";
        String password;

        System.out.print("Please enter your pasword:");
        password = keyInput.nextLine();

        if(storedPassword == password)
        {
            System.out.printf("\nUsing [==] to compare the two passwoord face us CORRECT result.\n");
        }
        else
        {
            System.out.printf("\nUsing [==] to compare the two passwoord face us WRONG result.\n");
        }

        if(storedPassword.equals(password))
        {
            System.out.printf("\nUsing [equals] to compare the two passwoord face us CORRECT result.\n");
        }
        else
        {
            System.out.printf("\nUsing [equals] to compare the two passwoord face us WRONG result.\n");
        }


        

        


    }
}