import java.util.Scanner;

@FunctionalInterface
interface InterfaceArithmeticComputation
{
    int compute(int a, int b);
}

public class LambdaExpressionDemoUsingInterface
{
    public static void main(String[] args)
    {
        //Lambda Expressions
        InterfaceArithmeticComputation sum = (a, b) -> a + b;
        InterfaceArithmeticComputation mul = (a, b) -> a * b;
        InterfaceArithmeticComputation div = (a, b) -> a / b;
        InterfaceArithmeticComputation sub = (a, b) -> a - b;
        InterfaceArithmeticComputation modl = (a, b) -> a % b;
        InterfaceArithmeticComputation alg = (a, b) -> (2 * a) + b;     // x = 2a + b

        Scanner keyInput = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter 1st number: ");
        num1 = keyInput.nextInt();
        
        System.out.print("Enter 2nd number: ");
        num2 = keyInput.nextInt();
        
        System.out.println("\n");
        
        System.out.printf("%d + %d = %d\n", num1, num2, sum.compute(num1,num2));
        System.out.printf("%d - %d = %d\n", num1, num2, sub.compute(num1,num2));
        System.out.printf("%d * %d = %d\n", num1, num2, mul.compute(num1,num2));
        System.out.printf("%d / %d = %d\n", num1, num2, div.compute(num1,num2));
        System.out.printf("%d %% %d = %d\n", num1, num2, modl.compute(num1,num2));
        System.out.printf("2[%d] + %d = %d\n", num1, num2, alg.compute(num1,num2));
        
        

        




    }
}


