import java.util.Scanner;

public class ArithmeticExceptionError
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        double numerator, denominator, result;

        for (int k = 0; k < 5; k++)
        {
            System.out.print("Enter the numerator: ");
            numerator = s.nextDouble();
    
            System.out.print("Enter the denominator: ");
            denominator = s.nextDouble();
            
            result = numerator / denominator;
            System.out.printf("%.2f / %.2f = %.2f\n", numerator, denominator, result);
        }
    }
}