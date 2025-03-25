import java.util.Arrays;

public class MinMaxArraysUsingEhnancedLoop
{
    public static void main(String[] args)
    {
        double[] numbers = {100, 15, 200, 25, 30, 135, 40, 5, 50, 55, 700, 1, 257, 67, 85, 101};

        double min = numbers[0];
        double max =  numbers[0];

        for (double number :  numbers)
        {
            if (number < min)  
            { 
                min = number;   //min = 5
            }
            
            if (number > max)
            {
                max = number;   //max = 200
            }            
        }
        System.out.println(Arrays.toString(numbers));
        System.out.printf("The Min. is %.2f. \nMax. is %.2f. \n", min, max);
 

    }
}