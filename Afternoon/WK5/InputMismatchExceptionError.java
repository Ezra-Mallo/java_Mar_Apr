import java.util.Scanner;

public class InputMismatchExceptionError
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in);
        double num1, num2, result;

        for (int k = 0; k < 5; k++)
        {       
            
            System.out.print("Enter the 1st number: ");
            num1 = s.nextDouble();

            System.out.print("Enter the 2nd number: ");
            num2 = s.nextDouble();

            result = num1 + num2;
            System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
        }

        



    }
}
