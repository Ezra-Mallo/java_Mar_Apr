import java.util.Scanner;

public class MultiplicationTable
{
    public static void main (String[] args)
    {       
        Scanner inputKey = new Scanner(System.in);
        int number, loopControlVariable,result;

        System.out.print("Enter the number for multiplication: ");
        number = inputKey.nextInt();

        loopControlVariable = 1;

        

        while(loopControlVariable <= 20)        
        {
            result = number * loopControlVariable;
            System.out.printf("%d x %d = %d \n", number, loopControlVariable, result);

            //loopControlVariable = loopControlVariable + 1;    
            
            //loopControlVariable += 1;   // will give you same result as lines 25 and 26 
            //loopControlVariable++;      // will give you same result as lines 24 and 26 
            ++loopControlVariable;        // will give you same result as lines 24 and 25    


        }

    }
}