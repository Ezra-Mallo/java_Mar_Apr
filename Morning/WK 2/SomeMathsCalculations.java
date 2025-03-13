import java.util.Scanner;
import java.lang.Math;
import java.time.LocalDateTime;


public class SomeMathsCalculations
{
    public static void main(String [] args)
    {
        double num1, num2, result;

        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter 1st number: ");   
        num1= myInput.nextDouble();

        System.out.print("Enter 2nd number: ");
        num2= myInput.nextDouble();

        result = Math.abs(num1);
        System.out.printf("\nThe abs of [%.2f] = %.2f ",num1, result);

        result = Math.sqrt(result);
        System.out.printf("\nThe sqaure root of abs of [%.2f] = %.2f",num1, result);

        result = Math.pow(num1, num2);
        System.out.printf("\n[%.2f] raised to power [%.2f] = [%.2f] ",num1, num2, result);

        result = Math.max(num1, num2);
        System.out.printf("\nThe max between [%.2f] and [%.2f] = [%.2f]",num1, num2, result);


        result = Math.min(num1, num2);
        System.out.printf("\nThe min between [%.2f] and [%.2f] = [%.2f]",num1, num2, result);

        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("\nThe current Date and time is "+ curDateTime);
        System.out.println("The year is "+ curDateTime.getYear());
        System.out.println("--------------------------------------");

        System.out.println("The Month is "+ curDateTime.getMonth());
        System.out.println("The Month Value is "+ curDateTime.getMonthValue());
        System.out.println("--------------------------------------");


        System.out.println("The day of Week is "+ curDateTime.getDayOfWeek());
        System.out.println("The day of month is "+ curDateTime.getDayOfMonth());
        System.out.println("The day of year is "+ curDateTime.getDayOfYear());        
         
        myInput.close();
    }
}

