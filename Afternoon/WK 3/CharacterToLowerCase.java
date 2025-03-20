public class CharacterToLowerCase
{   
    public static void main(String[] args)
    {

        char firstChar = 'R';
        char secondChar = 'T';
        char thirdChar = 'Q';

        char result1, result2, result3;

        result1 = Character.toLowerCase(firstChar);
        result2 = Character.toLowerCase(secondChar);
        result3 = Character.toLowerCase(thirdChar);

        System.out.printf("\nConverting  [%c] to Lower case give us %c",firstChar,result1);
        System.out.printf("\nConverting  [%c] to Lower case give us %c",secondChar,result2);
        System.out.printf("\nConverting  [%c] to Lower case give us %c",thirdChar,result3);
    }

}