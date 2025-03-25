import java.util.Scanner;

public class StringMethodsDemo1
{
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);
        String stringVariable1 = "";
        String stringVariable2 = "";
        String stringVariable3 = "";

        int countXter1, countXter2;

        System.out.printf("Enter any String: ");
        stringVariable1 = keyInput.nextLine();

        countXter1 = stringVariable1.length();
        System.out.printf("[%s] is [%d] characters length.\n", stringVariable1, countXter1);

        stringVariable2 = stringVariable1.toLowerCase();
        System.out.printf("Converting [%s] to lower case will give [%s].\n", stringVariable1, stringVariable2);

        
        
        stringVariable3 = stringVariable1.toUpperCase();
        System.out.printf("Converting [%s] to upper case will give [%s].\n", stringVariable1, stringVariable3);


                
        stringVariable3 = stringVariable1.trim();
        countXter2 = stringVariable3.length();        
        System.out.printf("[%s] is [%d] characters length. But after performing a trim the new text is \n[%s] is [%d] characters length. \n", stringVariable1, countXter1,  stringVariable3, countXter2);

    }
}