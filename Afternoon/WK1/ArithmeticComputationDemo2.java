import java.util.Scanner;

public class ArithmeticComputationDemo2
{
    public static void main(String[] args)
    {
        Scanner KeyEntry = new Scanner (System.in);

        float a, b;
        double mainResult;

        System.out.print("Enter the value of a:");
        a = KeyEntry.nextFloat();

        System.out.print("Enter the value of b:");
        b = KeyEntry.nextFloat();
        

        //to call the add method that does not return a value
        add(a, b);

        //to call the sub, mul, idv  methods that does not return a value
        mainResult = sub(a,b);
        System.out.printf(" %.2f - %.2f = %.2f \n",a, b, mainResult);


        mainResult = mul(a,b);
        System.out.printf(" %.2f * %.2f = %.2f \n",a, b, mainResult);

        mainResult = div(a,b);
        System.out.printf(" %.2f / %.2f = %.2f \n",a, b, mainResult);


        
        mainResult = mod(a,b);
        System.out.printf(" %.2f modulus %.2f = %.2f \n",a, b, mainResult);
    }

    public static void add(float x, float y)
    {
        double result = x + y;
        System.out.printf(" %.2f + %.2f = %.2f \n",x, y, result);

    }


    public static double sub(float i, float j)
    {
        double result = i - j;
        return result;
    }

    public static double mul(float x, float y)
    {        
        return x * y;
    }

    public static double div(float x, float y)
    {        
        return x / y;
    }

    public static double mod(float x, float y)
    {        
        return x % y;
    }

}