import java.util.Scanner;

public class TeneraryOperator
{
    public static void main (String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        double myScore;

        System.out.print("Enter your score:"); 
        myScore= myInput.nextDouble();
        String result;
        
        
        //  testExpression           ?   trueResult               :  falseResult                                ;
        result = (myScore >= 65)     ?  "Great Job. You passed."  :  "Sorry. You did not meet the requirement." ;

        System.out.println(result);
    }
}