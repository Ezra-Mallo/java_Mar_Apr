public class MultiplicationTableNestedLoop
{
    public static void main(String[] args)
    {
        int OuterLoopMax = 12;
        int innerLoopMax = 20;

        //         1                               <= 12            incremental 
        for (int outerCounter = 1; outerCounter <= OuterLoopMax; outerCounter++)
        {
            int result = 1;
            
            //             1                       <= 20
            for(int innerCounter = 1; innerCounter <= innerLoopMax; innerCounter++)
            {
                result = outerCounter * innerCounter;
                System.out.printf("%d * %d = %d\n", outerCounter, innerCounter, result);                  
            }         
            
            System.out.println("-----------------------");

        }
        
    }
}
