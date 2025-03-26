import java.util.Scanner;

public class Enumerators
{
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THUURSDAY, FRIDAY, SATURDAY, SUNDAY};

    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        

        System.out.print("What is today? (e.g. Monday, Tuesday...): ");
        String currentDay = keyInput.nextLine();
        
        
        Day today = Day.valueOf(currentDay.toUpperCase());
        
        if(today == Day.SATURDAY || today == Day.SUNDAY )
        {
            System.out.println("Today is " + currentDay + " and it is a Weekend");
        }
        else
        {
            System.out.println("Today is [" + currentDay + "] and it is a Weekday");
        }

    }
}