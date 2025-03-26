import java.util.Scanner;


public class Enumerators
{
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRDAY, SATURDAY, SUNDAY};

    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);

        System.out.print("What is Today? (Monday, Tuesday ...): ");
        String currentDay = keyInput.nextLine().toUpperCase();


        Day today = Day.valueOf(currentDay);

        if(today == Day.SATURDAY || today == Day.SUNDAY)
        {
            System.out.println("\nToday is [" + currentDay + "] and it is a Weekend! Have fun!"); 
        }
        else
        {
            System.out.println("\nToday is [" + currentDay + "] and it is a Weekday!"); 
        }


    }
}