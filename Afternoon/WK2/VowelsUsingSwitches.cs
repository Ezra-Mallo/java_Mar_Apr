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

        if (alph == 65)   // A
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 69)   // E
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 73)   // I
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 79)   // O
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 85)   // U
        {
            System.out.printf("%c is a vowel.", alph);
        }

        else if (alph == 97)   // a
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 101)   // e
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 105)   // i
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 111)   // o
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else if (alph == 117)   // u
        {
            System.out.printf("%c is a vowel.", alph);
        }
        else
        {
            System.out.printf("%c is a consonant.", alph);

        }
        System.out.println("\nThank you.");

    }
}