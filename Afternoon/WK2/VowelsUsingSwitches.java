import java.util.Scanner;

public class VowelsUsingSwitches
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        char alph;
        
        System.out.print("Enter a character (A-Z,a-z): ");
        alph = myInput.next().charAt(0);

        confirmVowelOrConsonant(alph);
    }

    public static void confirmVowelOrConsonant(char alph)
    {
        //65, 69, 73, 79, 85
        //97, 101, 105, 111, 117

        if ((alph >=65 && alph <= 90 )   || (alph >=97 && alph <= 122 ))
        {
            switch(alph)
            {
                case 'A', 'E', 'I', 'O', 'U','a', 'e', 'i', 'o', 'u':
                    System.out.printf("%c is a vowel.", alph);
                    break;
                default:
                    System.out.printf("%c is a consonant.", alph);
                    //break;
            }
        }
        else
        {
            System.out.printf("%c is not an alphabet.", alph);
        }
        System.out.println("\nThank you.");
    }
}