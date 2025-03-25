//import java.util.Scanner;

public class StringMethodsDemo2
{
    public static void main(String[] args)
    {
        //Scanner keyInput = new Scanner(System.in);
        String myTest1 = "Hello everyone. Welcome to this Java Proramming Class.";
        String myTest2, myTest3;
        char myXter1 = 'W';
        int index = 11;
        int theIndexOfACharacter;

        theIndexOfACharacter = myTest1.indexOf(myXter1);
        System.out.printf("In this Text [%s],  [%c] is at index [%d].\n", myTest1, myXter1, theIndexOfACharacter);


        myXter1 = 'e';
        theIndexOfACharacter = myTest1.indexOf(myXter1);
        System.out.printf("In this Text [%s],  [%c] is at index [%d].\n", myTest1, myXter1, theIndexOfACharacter);


        char xterAtAnIndex = myTest1.charAt(index);
        System.out.printf("In this Text [%s],  Character at index [%d] is [%c].\n", myTest1, index, xterAtAnIndex);

        char oldXter = 'a';
        char newXter = '@';

        myTest2 = myTest1.replace(oldXter, newXter);        
        System.out.printf("In this Text [%s],  replacing all [%c] with [%c] will give us \n[%s]\n", myTest1, oldXter,newXter, myTest2);


        int substringIndex1 = 32;
        int substringIndex2  = 47;

        myTest3 = myTest1.substring(substringIndex1);
        System.out.printf("In this Text [%s],  the subscript at [%d] will return \n[%s]\n", myTest1, substringIndex1,myTest3);

        
        myTest3 = myTest1.substring(substringIndex1, substringIndex2);
        System.out.printf("In this Text [%s],  the subscript at [%d] will return \n[%s]\n", myTest1, substringIndex1,myTest3);


    }
}