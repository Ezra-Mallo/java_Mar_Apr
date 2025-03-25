import java.util.Arrays;

public class MinMaxArrays
{
    public static void main(String[] args)
    {
        double[] numbers = {100, 15, 200, 25, 30, 135, 40, 5, 50, 55, 700, 1, 257, 67, 85, 101};

        double min = numbers[0];
        double max =  numbers[0];

        for (int k = 0; k < numbers.length ; k++)
        {
            if (numbers[k] < min)  
            { 
                min = numbers[k];   //min = 5
            }
            
            if (numbers[k] > max)
            {
                max = numbers[k];   //max = 200
            }            
        }
        System.out.println(Arrays.toString(numbers));
        System.out.printf("The Min. is %.2f. \nMax. is %.2f. \n", min, max);
 

    }
}