
import java.util.Scanner;

public class Base10ToBase2
{
    public static void main(String[] args)
    {
        /*
        10 to base
        10/2 = 5,  0
        5/2  = 2, 1
        2/2 = 1 = 0
        1/2 = 0 , 1
        
            128 64 32 16     8 4  2 1
                            1 0  1 0 
            0  0  1  0      0 1  0 0
            1  0  1  0      0 0  0 0

            */
            Scanner inputKey = new Scanner(System.in);
            int number;
            int loopControlVariable = 0;
            int divResult;
            int remenderResult;

            System.out.print("Enter base 10 to be converted: ");
            number = inputKey.nextInt();  

            while(loopControlVariable != 1)
            {
                divResult= number / 2;
                remenderResult = number % 2;
                System.out.printf("%d", remenderResult);
                number = divResult;
                loopControlVariable = divResult;
            }
            System.out.printf("%d", loopControlVariable);
    }
}