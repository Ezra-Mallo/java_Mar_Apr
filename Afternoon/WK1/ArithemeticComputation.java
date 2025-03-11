import java.util.Scanner;

public class ArithemeticComputation
{
    public static void main(String[] args)
    {
        Scanner KeyEntry = new Scanner (System.in);

        float a, b;
        double result;

        System.out.print("Enter the value of a:");
        a = KeyEntry.nextFloat();

        System.out.print("Enter the value of b:");
        b = KeyEntry.nextFloat();

        result = a + b;
        System.out.printf(" %.2f + %.2f = %.2f \n",a, b, result);
                
        result = a - b;
        System.out.printf(" %.2f - %.2f = %.2f \n",a, b, result);
        
        result = a * b;
        System.out.printf(" %.2f * %.2f = %.2f \n",a, b, result);        

        result = a / b;
        System.out.printf(" %.2f / %.2f = %.2f \n",a, b, result);        

        result = a % b;
        System.out.printf(" %.2f modulus %.2f = %.2f \n",a, b, result);    
    }
}