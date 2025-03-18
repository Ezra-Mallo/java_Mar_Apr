import java.util.Scanner;

public class VowelsConsonantMultipleIf
{
    public static void main(String[] args)
    {

        Scanner myInput = new Scanner(System.in);
        char myChar;

        System.out.print("Enter a character :"); 
        myChar= myInput.next().charAt(0);

        confirmVowelConsonant(myChar);
    }

    public static void confirmVowelConsonant(char myChar)
    {
        //65, 69, 73, 79, 85
        //97, 101, 105, 111, 117
        if ((myChar >= 65 && myChar <=90) || (myChar >= 97 && myChar <=122) )
        {
            if (myChar == 65)  // A
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 69) // E
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 73)     // I   
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 79)     // O
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 85)     // U   
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 97)        // a
            {  
                System.out.printf("%c is vowel",myChar);  
            }           
            else if (myChar == 101)       // e
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar ==105)        // i
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 111)        // o
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else if (myChar == 117) // o
            {
                System.out.printf("%c is vowel",myChar);
            }  
            else  
            {
                System.out.printf("%c is consonant",myChar);

            }
        }
        else
        {
            System.out.printf("%c is not an alphabet.",myChar);

        }

    }

}
