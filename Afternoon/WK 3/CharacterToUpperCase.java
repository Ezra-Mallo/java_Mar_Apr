public class CharacterToUpperCase
{   
    public static void main(String[] args)
    {

        char firstChar = 'a';
        char secondChar = 'b';
        char thirdChar = 'D';

        char result1, result2, result3;

        result1 = Character.toUpperCase(firstChar);
        result2 = Character.toUpperCase(secondChar);
        result3 = Character.toUpperCase(thirdChar);

        System.out.printf("\nConverting  [%c] to upper case give us %c",firstChar,result1);
        System.out.printf("\nConverting  [%c] to upper case give us %c",secondChar,result2);
        System.out.printf("\nConverting  [%c] to upper case give us %c",thirdChar,result3);
    }

}