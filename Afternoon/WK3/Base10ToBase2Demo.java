import java.util.Scanner;


public class Base10ToBase2Demo
{
    public static void main(String[] args)
    {

        /*
            10/2 = 5 (integer division), 10 % 2 = 0
            5/2  = 2                      5 % 2 = 1
            2/2  = 1                      2 % 2 = 0
            1/2  = 0                      1 % 2 = 1 

            write result from down to up (1010)   correct
            write result from up to down (0101) 

                7   6   5  4       3  2  1  0
            128 64  32 16       8  4  2  1
                                1  0  1  0      = 10
            0   0   0   1       0  1  1  1      = 23
        */

        Scanner inputKey = new Scanner(System.in);
        int number;
        int divResult, remenderResult;

        System.out.print("Enter the number to be converted from base 10 to base 2:");
        number = inputKey.nextInt();


        while(number != 1)
        {
            divResult = number / 2;
            remenderResult = number % 2;
            System.out.printf("%d", remenderResult);
            number = divResult;
            
        }
        System.out.print(number);

    }
}


