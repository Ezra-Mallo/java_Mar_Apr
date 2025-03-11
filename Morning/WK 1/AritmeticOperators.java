import java.util.Scanner;

public class AritmeticOperators
{
    public static void main(String[] args)
    {
        Scanner KeyboardInput = new Scanner (System.in);

        int num1, num2, result;

        System.out.print("Enter the 1st number: ");
        num1 = KeyboardInput.nextInt();

        System.out.print("Enter the 2nd number: ");
        num2 = KeyboardInput.nextInt();

        result = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1,num2,result);
        System.out.println("------------------");


        result = num1 - num2;
        System.out.printf("%d - %d = %d\n", num1,num2,result);
        System.out.println("------------------");


        result = num1 * num2;
        System.out.printf("%d * %d = %d\n", num1,num2,result);

        System.out.println("------------------");

        result = num1 / num2;
        System.out.printf("%d / %d = %d\n", num1,num2,result);
        System.out.println("------------------");


        result = num1 % num2;
        System.out.printf("%d mod %d = %d\n", num1,num2,result);
        System.out.println("------------------");


        



    }
}