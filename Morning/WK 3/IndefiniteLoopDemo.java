
import java.util.Scanner;

public class IndefiniteLoopDemo
{
    public static void main(String [] args)
    {
        Scanner inputKey = new Scanner(System.in);
        int number = 0;

        while (number != 99)   //not equal to is represented as !=
        {
            System.out.println("Options  \n1. Open an Account.\n2. Credit. \n3. Withdraw. \n4. Close account. \n99. Exit\n");

            System.out.print("Make your selection: ");
            number = inputKey.nextInt();


            switch(number)
            {
                case 1:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Thanks for choosing to Open account\n");
                    System.out.print("-------------------------------------\n\n");
                    break;

                case 2:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Thanks for choosing to Credit money into your account\n");
                    System.out.print("-------------------------------------\n\n");
                    break;
                    
                case 3:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Thanks for choosing to withdraw money from your account\n");
                    System.out.print("-------------------------------------\n\n");
                    break;
                    
                case 4:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Thanks for choosing to close your account.\n");
                    System.out.print("-------------------------------------\n\n");
                    break;
                    
                case 99:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Good bye\n");
                    System.out.print("-------------------------------------\n\n");
                    break;      
                default:
                    System.out.print("\n-------------------------------------\n");
                    System.out.print("Wrong Selection\n");
                    System.out.print("-------------------------------------\n\n");          
            }

        }
    }
}