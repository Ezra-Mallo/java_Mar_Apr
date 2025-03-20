import java.util.Scanner;

public class IndefiniteLoopDemo
{
    public static void main(String[] args)
    {
        Scanner inputKey = new Scanner(System.in);
        int number = 0;
        
        while(number != 99)
        {
            System.out.print("OPTIONS: \n1. Open Account. \n2. Credit Account. \n3. Withdraw. \n4. Close Account \n99. Exit. \n\nMake your selection: ");
            number = inputKey.nextInt();


            switch (number) 
            {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Thanks for choosing to open an account with us.");
                    System.out.println("----------------------------------------------");
                    break;
                
                case 2:
                    System.out.println("----------------------------------------------");
                    System.out.println("Thanks for choosing to credit your account.");
                    System.out.println("----------------------------------------------");
                    break;

                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("Thanks for choosing to debit your account with us.");
                    System.out.println("----------------------------------------------");
                    break;
                    
                case 4:
                    System.out.println("----------------------------------------------");
                    System.out.println("Thanks for choosing to close your account.");
                    System.out.println("----------------------------------------------");
                    break;
                
                case 99:
                    System.out.println("----------------------------------------------");
                    System.out.println("Good bye.");
                    System.out.println("----------------------------------------------");
                    break;            
            
                default:
                    System.out.println("----------------------------------------------");
                    System.out.println("Wrong selecion. Please try again.");
                    System.out.println("----------------------------------------------");
                    break;
            }

        }

    }
}
