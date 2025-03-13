import java.util.Scanner;
import java.lang.Math;
import java.time.LocalDateTime;



public class SomeMathsCalculations
{
    public static void main(String [] args)
    {
        Scanner keyInput = new Scanner(System.in);

        double num1, num2, result;

        System.out.print("Enter the 1st number:");
        num1 = keyInput.nextDouble();

        System.out.print("Enter the 2nd number:");
        num2 = keyInput.nextDouble();

        result = Math.abs(num1);
        System.out.printf("The abs value of [%.2f] is [%.2f]\n",num1, result);
        result = Math.abs(num2);
        System.out.printf("The abs value of [%.2f] is [%.2f]\n",num2, result);


        result = Math.sqrt(num1);
        System.out.printf("The square root of [%.2f] is [%.2f]\n",num1, result);
        result = Math.sqrt(num2);
        System.out.printf("The square root of [%.2f] is [%.2f]\n",num2, result);

        
        result = Math.max(num1, num2);
        System.out.printf("The max between [%.2f] and [%.2f] is [%.2f]\n",num1, num2, result);
        result = Math.min(num1, num2);
        System.out.printf("The min between [%.2f] and [%.2f] is [%.2f]\n",num1, num2, result);
        
        

        result = Math.pow(num1, num2);
        System.out.printf("[%.2f] raise power [%.2f] is [%.2f]\n",num1, num2, result);
        
        result = Math.random();
        System.out.printf("Random number generated is [%.2f] \n", result);
        
        result = (int) ((result * 6) + 1);
        System.out.printf("Converting the Random to range between 1 and 6 [%.2f] \n", result);

        LocalDateTime curDateTime = LocalDateTime.now();


        System.out.printf("\nThe date and time is " + curDateTime);
        System.out.printf("\nThe year is " + curDateTime.getYear());
        System.out.println("\n-------------------------------------");



        System.out.printf("\nThe month is " + curDateTime.getMonth());
        System.out.printf("\nThe month value is " + curDateTime.getMonthValue());
        System.out.println("\n-------------------------------------");

        System.out.printf("\nThe day of the week is " + curDateTime.getDayOfWeek());
        System.out.printf("\nThe Day of the month is " + curDateTime.getDayOfMonth());
        System.out.printf("\nThe day of the year is " + curDateTime.getDayOfYear());
        






    }
}