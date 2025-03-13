import java.util.Scanner;
public class EvenOddNumber
{
    public static void main(String[] args)
    {

        Scanner myInput = new Scanner(System.in);
        double myNumber, result;

        System.out.print("Enter the number: ");   
        myNumber= myInput.nextDouble();

        result = myNumber % 2;
        
  
        if (result == 0)  
        {
            System.out.printf("%.2f is an even number.\n",myNumber); 
            //System.out.println("Thank you for using our app."); 
        } else {
            System.out.printf("%.2f is an odd number.\n",myNumber); 
            //System.out.println("Thank you for using our app."); 
        }

        System.out.println("Thank you for using our app."); 

        


    }
}