import java.util.Scanner;

public class StringMethodsDemo1
{
    public static void main(String[] args)
    {
        Scanner keyInput= new Scanner(System.in);
        String stringVariable1 = "";
        String stringVariable2 = "";
        String stringVariable3 = "";
        int countXter;
        int countXter2;

        System.out.print("Enter any String: ");
        stringVariable1 = keyInput.nextLine();

        countXter = stringVariable1.length();

        System.out.printf("[%s] is [%d] character long.\n",stringVariable1, countXter);

        stringVariable2 = stringVariable1.toLowerCase();
        System.out.printf("Converting [%s] to lower case give [%s]. \n",stringVariable1, stringVariable2);
        

        stringVariable2 = stringVariable1.toUpperCase();
        System.out.printf("Converting [%s] to upper case give [%s]. \n",stringVariable1, stringVariable2);

        
        stringVariable3 = stringVariable1.trim();
        countXter2 = stringVariable3.length();
        System.out.printf("[%s] is [%d] character long. But after Triming we now have \n[%s] which is [%s] characere long",stringVariable1, countXter,stringVariable3, countXter2);


        keyInput.close();
    }
}