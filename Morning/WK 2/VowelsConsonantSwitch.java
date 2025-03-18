import java.util.Scanner;

public class VowelsConsonantSwitch
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
            switch(myChar)
            {
                case 'A', 'E','I', 'O','U', 'a', 'e','i', 'o','u':
                    System.out.printf("%c is vowel.",myChar);
                    break;                                  
                default:
                    System.out.printf("%c is Consonant.",myChar);
                    break;   
            }
        }
        else
        {
            System.out.printf("%c is not an alphabet.",myChar);
            
        }
    }
}