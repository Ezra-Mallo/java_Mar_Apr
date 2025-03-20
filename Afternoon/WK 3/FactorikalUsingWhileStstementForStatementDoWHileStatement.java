import java.util.Scanner;

public class FactorikalUsingWhileStstementForStatementDoWHileStatement
{
    public static void main(String[] args)
    {
        /*
            n!
            5!   = 5 * 4 * 3 * 2 * 1   = 120            
        */
        Scanner inputKey = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number for Factorial result: ");
        number = inputKey.nextInt();

        factorialWhileLoop(number);
        factorialForLoop(number);
        factorialDoWhileLoop(number);
    }


    public static void factorialWhileLoop(int n)
    {
        int result = 1;
        while( n >1)
        {
            result = result * n;
            n--;
            // n = n - 1 or n -= 1  same as line 25 above
        }
        System.out.println("-----------While Loop ------------------------");
        System.out.println(result);
    }

    public static void factorialForLoop(int n)
    {
        int result = 1;
        for(int k = n; k > 1; k--)
        {
            result = result * k;           
        }
        System.out.println("-----------For Loop ------------------------");
        System.out.println(result);        
    }


    public static void factorialDoWhileLoop(int n)
    {
        int result = 1;
        do
        {
            result = result * n;
            n--;
            // n = n - 1 or n -= 1  same as line 25 above
        }while( n >1);

        
        System.out.println("-----------Do While Loop ------------------------");
        System.out.println(result);        
    }

}