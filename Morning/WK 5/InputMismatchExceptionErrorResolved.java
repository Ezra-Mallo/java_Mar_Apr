import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionErrorResolved
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        double num1, num2, result;

        for (int k = 0; k < 5; k++)
        { 
            try
            {      

                System.out.printf("-------------#%d---------------\n",(k+1));

                System.out.print("Enter the 1st number: ");
                num1 = s.nextDouble();
    
                System.out.print("Enter the 2nd number: ");
                num2 = s.nextDouble();
    
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
            }
            catch(InputMismatchException e)
            {
                //System.out.println("Error: " + e.getMessage());
                System.out.println("Error: Invalid input. You entered a non numeric value.");
                s.next();
                k--;
            }
        }
    }
}
