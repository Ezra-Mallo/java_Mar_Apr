import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {        
        Scanner inputKey = new Scanner(System.in);
        int number, loopCount, result;

        
        System.out.printf("Enter the number to be multiplied: ");
        number = inputKey.nextInt();    

        loopCount = 1;

        while(loopCount <= 20)
        {
            result = number * loopCount;
            System.out.printf("%3d x %3d = %3d\n", number, loopCount, result);
            //loopCount = loopCount + 1;    // this is same as lines 21, 22 & 23
            //loopCount +=  1;              // this is same as lines 20, 22 & 23
            //loopCount++;                  // this is same as lines  20, 21 & 23
            ++loopCount;                    // this is same as lines  20, 21 & 22
        }
        inputKey.close();
    }
}