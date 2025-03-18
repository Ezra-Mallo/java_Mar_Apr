import java.util.Scanner;

public class ValidVoterLogicalOperators
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        double citizen, age, id;

        System.out.print("Are you a citizen of Canada? 1. Yes, 2. No: ");
        citizen = input.nextDouble();

        System.out.print("What is your age ( eg. 18 yrs): ");
        age = input.nextDouble();

        System.out.print("Do you have a valid ID?  1. Yes, 2. No: ");
        id = input.nextDouble();

        if ((citizen == 1) && (age >= 18) &&  (id == 1))
        {
            System.out.print("Congratualtions. You can proceed to the next desk to cast your vote.");
        }
        else
        {
            System.out.println("Sorry. You are not qualfied to vote.");
        }
    }
}