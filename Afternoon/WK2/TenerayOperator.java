import java.util.Scanner;

public class TenerayOperator
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        double score;
        String result;
        
        System.out.print("Enter your score: ");
        score = myInput.nextDouble();

        /*if (score >=65)
        {
            System.out.printf("%.2f is a pass.", score);
        }
        else
        {
            System.out.printf("%.2f is a fail.", score);
        }
        */

        result = (score >=65) ? ("%.2f is a pass.") : ("%.2f is a fail.");
        System.out.printf(result);


    }
}