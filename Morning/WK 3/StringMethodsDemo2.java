//pubimport java.util.Scanner;

public class StringMethodsDemo2
{
    public static void main(String[] args)
    {
        //Scanner keyInput= new Scanner(System.in);
        String myText1 = new String("Hello everyone. Welcome to this Java programming Class.");
        String myText2;
        char xter1 = 'W';
        int num1 = 11;
        int  theIndexOfACharacter;
                
        theIndexOfACharacter = myText1.indexOf(xter1);
        System.out.printf("In this string [%s], [%c] is at index [%d] .\n",myText1, xter1, theIndexOfACharacter);


        xter1 = 'e';
        theIndexOfACharacter = myText1.indexOf(xter1);
        System.out.printf("In this string [%s], [%c] is at index [%d] .\n",myText1, xter1, theIndexOfACharacter);



        char xterAtAnIndex  = myText1.charAt(num1);
        System.out.printf("In this string [%s], the charater at the index position [%d] is [%c] .\n",myText1, num1, xterAtAnIndex);

        char oldChar  = 'a';
        char newChar ='@';
        myText2 = myText1.replace(oldChar, newChar);
        System.out.printf("In this string [%s], replacing all [%c] with [%c] will be me \n[%s].\n",myText1, oldChar, newChar, myText2);

    }
}