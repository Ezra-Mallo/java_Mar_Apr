import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryAndCatchExceptionsDemo1
{
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in); // Scanner should be outside the try block

        for (int k = 0; k < 5; k++) 
        {
            try 
            {
                System.out.printf("-------------#%d-----------------\n",(k + 1));
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
            catch (ArithmeticException e) 
            {
                System.out.println("----Error caught by ArithmeticException----");
                System.out.println("Error: " + e.getMessage());
            }            
            catch(InputMismatchException e)
            {
                System.out.println("----Error caught by InputMismatchException----");
                //System.out.println("Error: " + e.getMessage());
                System.out.println("Error: Invalid input. You entered a non numeric value.");
                s.next();
                k--;
            }        
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("----Error caught by ArrayIndexOutOfBoundsException----");
                System.out.println(e.getMessage());       
                System.out.println("The index you enters is not between 0...9");       
            }
            catch(NullPointerException e)
            {
                System.out.println("----Error caught by NullPointerException----");
                System.out.println("Error: "+ e.getMessage());     
                s.next();
                  
            }

        }
        s.close();
    }
}