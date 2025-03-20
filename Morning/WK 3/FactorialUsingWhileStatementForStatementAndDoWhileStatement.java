
import java.util.Scanner;

public class FactorialUsingWhileStatementForStatementAndDoWhileStatement
{
    public static void main(String[] args)
    {
        //5! = 5 * 4 * 3 * 2 * 1 = 

        Scanner inputKey = new Scanner(System.in);
        int number, result;
        int loopControlVariable = 0;
        
        System.out.print("Enter your number for factorial: ");
        number = inputKey.nextInt(); 

        System.out.print("\n------------While Statement   -------------------------\n");
        factorialWhile(number);
        System.out.print("\n------------For Statement     -------------------------\n");
        factorialFor(number);       
        System.out.print("\n------------Do While Statement-------------------------\n");
        factorialDoWhile(number);      
    }

    public static void factorialWhile(int n)
    {
        int result = 1;
        
        while (n > 1)
        {
            result = result * n;
            // result *=n  same as line 28

            n--;
        }
        System.out.print(result);
    }

    public static void factorialFor(int n)
    {
        int result = 1;
        
        for(int k = n; k > 1; k--) 
        {
            result = result * k;
        }
        System.out.print(result);
    }

    public static void factorialDoWhile(int n)
    {
        int result = 1;
        
        do
        {
            result = result * n;
            // result *=n  same as line 56

            n--;
        }while (n > 1);

        System.out.print(result);
    }


}


