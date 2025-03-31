import java.util.Scanner;

interface InterfaceArithmeticComputation
{
    int compute (int a, int b);
}

public class LambdaExpressionUsingInterface
{
    public static void main(String[] args)
    {
        //Lambda Expression

        InterfaceArithmeticComputation sum = (a, b) -> a + b;
        InterfaceArithmeticComputation sub = (a, b) -> a - b;
        InterfaceArithmeticComputation mul = (a, b) -> a * b;
        InterfaceArithmeticComputation div = (a, b) -> a / b;
        InterfaceArithmeticComputation modl = (a, b) -> a % b;
        InterfaceArithmeticComputation alg = (a, b) -> (2 * a) + b;   // x = 2a + b

        Scanner keyInput = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter the 1st Number: ");
        num1 = keyInput.nextInt();

        System.out.print("Enter the 2nd Number: ");
        num2 = keyInput.nextInt();

        System.out.println();

        System.out.printf("%d + %d = %s\n", num1, num2, sum.compute(num1, num2));
        System.out.printf("%d - %d = %s\n", num1, num2, sub.compute(num1, num2));
        System.out.printf("%d * %d = %s\n", num1, num2, mul.compute(num1, num2));
        System.out.printf("%d / %d = %s\n", num1, num2, div.compute(num1, num2));
        System.out.printf("%d %% %d = %s\n", num1, num2, modl.compute(num1, num2));
        System.out.printf("(2*%d) + %d = %s\n", num1, num2, alg.compute(num1, num2));

    }
    
}