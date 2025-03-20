public class CharacterToUpperCase
{
    public static void main(String[] args)
    {
        char firstChar = 'a';
        char secondChar = 'b';
        char result1, result2;

        result1 = Character.toUpperCase(firstChar);
        result2 = Character.toUpperCase(secondChar);

        System.out.printf("Changing [%c] to UpperCase gives : [%c] \n",firstChar,result1);
        System.out.printf("Changing [%c] to UpperCase gives : [%c] \n",secondChar,result2);
    }
}