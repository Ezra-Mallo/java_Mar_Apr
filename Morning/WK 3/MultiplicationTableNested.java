import java.util.Scanner;

public class MultiplicationTableNested
{
    public static void main (String[] args)
    {
        Scanner inputKey = new Scanner(System.in);
        int innerMax;
        int outerMax;
        
        System.out.print("Enter the inner loop maximum forthe nested  multiplication: ");
        innerMax = inputKey.nextInt();

        System.out.print("\nEnter the outer loop maximum forthe nested  multiplication: ");
        outerMax = inputKey.nextInt();


            // 1                      <= 12
        for(int outerCounter = 1; outerCounter <= outerMax; outerCounter++)
        {

            int result = 1;

            //       1                 <= 20
            for(int innerCounter = 1; innerCounter <= innerMax; innerCounter++)
            {
                result = outerCounter * innerCounter;
                System.out.printf("%3d  * %3d = %3d\n", outerCounter , innerCounter, result);
            }
            System.out.println("------------------------------");

        }

    }
}