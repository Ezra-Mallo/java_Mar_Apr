import java.util.Scanner;

public class LoopPrint
{
    public static void main(String[] arfgs)
    {
        Scanner inputKey = new Scanner(System.in);
        int loopMax, loopControlVariable;

        System.out.printf("How many times do you want me to print this?: ");
        loopMax = inputKey.nextInt();    
        
        loopControlVariable = 1;

        while(loopControlVariable <= loopMax)
        {
            System.out.printf("********************************* #%d\n",loopControlVariable );
            loopControlVariable = loopControlVariable + 1;
        }               
    }
}