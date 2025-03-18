import java.util.Scanner;

public class ValidVotersLogicalOperators
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double citizen, age, id;

        System.out.print("Are you a citizen? \t1. Yes \t2. No:");
        citizen = sc.nextDouble();

        
        System.out.print("Enter your age in years(eg 18)?: ");
        age = sc.nextDouble();

        System.out.print("Do you have a valid ID? \t1. Yes \t2. No: ");
        id = sc.nextDouble();

        if ((citizen == 1) && (age >= 18) && (id == 1)) // ||
        {
            System.out.print("Congratulations, you are qualified to vote. Proceed to the next table.\n");
        }
        else
        {
            System.out.print("Sorry, you are  NOT qualified to vote.\n");
        }
    }
}