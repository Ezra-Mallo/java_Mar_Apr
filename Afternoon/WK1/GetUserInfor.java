import java.util.Scanner;

public class GetUserInfor
{
    public static void main (String[] args)
    {
        Scanner KeyboardInput = new Scanner(System.in);
        String fName, lName;
        int age, score;
        float height;

        System.out.print("Enter your first Name:");
        fName = KeyboardInput.nextLine();

        System.out.print("Enter your last Name:");
        lName = KeyboardInput.nextLine();

        System.out.print("Enter your age:");
        age = KeyboardInput.nextInt();

        System.out.print("Enter your score:");
        score = KeyboardInput.nextInt();

        System.out.print("Enter your height:");
        height = KeyboardInput.nextFloat();


        System.out.printf("You name is %s %s. You are %d year old. You are %.2f feet tall and your score is %d.\n",
        fName,lName,age,height,score); 
    }
}