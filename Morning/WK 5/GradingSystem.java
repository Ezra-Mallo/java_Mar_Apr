import java.util.InputMismatchException;
import java.util.Scanner;

public class GradingSystem
{
    public static void main(String[] arg)
    {
        Scanner s = new Scanner(System.in); // Scanner should be outside the try block
        int[] studentID = new int[5];
        double[] score = new double[5];
        char[] grade = new char[5];


        for(int k =0; k < 5; k++)
        {
            try
            {
                System.out.printf("------------#%d-----------------\n",(k + 1));

                System.out.print("Enter Student ID: ");
                studentID[k] = s.nextInt();

                System.out.print("Enter Student score: ");
                score[k] = s.nextDouble();
                
                grade[k] = GradeEvaluator.evaluateScore(score[k]);
                

            }
            catch(InputMismatchException e)
            {
                System.out.println("Error: "+ e.getMessage());
                s.next();
                k--;
            }
            catch(MyInvalidScoreExceptions e)
            {
                System.out.println("Error: "+ e.getMessage());
                s.next();
                k--;
            }
        }


        for(int j =0; j < 5; j++)
        {
            System.out.printf("%d, %.2f, [%c]\n", studentID[j], score[j], grade[j]);
        }


        

    }    
}