import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArrays
{
    public static void main(String[] args)
    {
        double [] numbers = {10, 50, 20, 125, 300, 35, 15, 45, 50, 5, 150, 700, 1, 85};

        double min = numbers[0];
        double max =  numbers[0];

        /*
        for (int k = 0; k <= 9 ; k++)
        {
            if (numbers[k] < min) 
            {
                min = numbers[k];
            }

            if (numbers[k] > max) 
            {
                max = numbers[k];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.printf("The min is %.2f, and the Max is  %.2f\n",min, max);
        */

        for (int k = 0; k < numbers.length ; k++)
        {
            if (numbers[k] < min) 
            {
                min = numbers[k];
            }

            if (numbers[k] > max) 
            {
                max = numbers[k];
            }
        }
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.printf("The min is %.2f, and the Max is  %.2f\n",min, max);


    }
}