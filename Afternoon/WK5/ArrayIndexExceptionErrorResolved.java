import java.util.Scanner;

public class ArrayIndexExceptionErrorResolved
{
    public static void main(String[] arg)
    {
        try
        {
            double[] numbList = {1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            Scanner s = new Scanner(System.in);
            int index;
    
            for (int k = 0; k < 5; k++)
            {            
                System.out.print("Enter the index (0...9) and the value will be printed: ");
                index  = s.nextInt();
                
                System.out.printf("%.2f\n", numbList[index]);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("----------------------------");
            System.out.println(ex.getMessage());       
            System.out.println("The index you enters is not between 0...9");       
            
    

        }
    }
}