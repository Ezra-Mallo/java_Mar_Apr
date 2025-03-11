import java.util.Scanner;

public class GetUserInfor
{
    public static void main(String[] arg)
    {
        Scanner keyboardEntry = new Scanner(System.in);
        String fName, lName;
        int age, score;
        
        System.out.print("Ener your First Name:");
        fName = keyboardEntry.nextLine();

        System.out.print("Ener your Last Name:");
        lName = keyboardEntry.nextLine();

        System.out.print("Ener your Age:");
        age = keyboardEntry.nextInt();

        
        System.out.print("Ener your Score:");
        score = keyboardEntry.nextInt();

        System.out.println("------------------");
        System.out.printf("Hello %s %s. Welovme to this class. Your age is %d and your score is %d\n",fName,lName,age,score);
        



    }
}