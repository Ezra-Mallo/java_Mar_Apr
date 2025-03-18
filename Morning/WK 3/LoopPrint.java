import java.util.Scanner;

public class LoopPrint
{
    public static void main(String[] args)
    {
       
        Scanner inputKey = new Scanner(System.in);
        int loopLimit, loopControlVariable;

        System.out.print("How many time do you want it printed?: ");
        loopLimit = inputKey.nextInt();

        loopControlVariable = 1;

        while(loopControlVariable <= loopLimit)
        {
            System.out.println("Count #: " + loopControlVariable);
            loopControlVariable = loopControlVariable + 1;
        }
        


    }
}