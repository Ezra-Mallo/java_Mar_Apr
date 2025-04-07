import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryAndCatchDemo3HasFinally
{
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in); // Scanner should be outside the try block

        for (int k = 0; k < 5; k++) 
        {
            try 
            {
                System.out.printf("--------------#%d-----------\n",(k + 1));
                
                System.out.print("Enter the numerator: ");
                double numerator = s.nextDouble();
        
                System.out.print("Enter the denominator: ");
                double denominator = s.nextDouble();
                
                if (denominator == 0) { 
                    throw new ArithmeticException("Cannot divide by zero."); 
                }

                double result = numerator / denominator;
                System.out.printf("%.2f / %.2f = %.2f\n", numerator, denominator, result);
            } 
            catch (Exception e) 
            {
                System.out.println("Error: " + e.getMessage());
                s.next();
                k--;
            }
            finally
            {
                System.out.println("---- finally code block ----");

            }
       
        }
        s.close(); // Close scanner to prevent resource leaks
    }
}          