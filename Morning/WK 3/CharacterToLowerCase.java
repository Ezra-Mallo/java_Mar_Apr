public class CharacterToLowerCase
{
    public static void main(String[] args)
    {
        char firstChar = 'C';
        char secondChar = 'D';
        char result1, result2;

        result1 = Character.toLowerCase(firstChar);
        result2 = Character.toLowerCase(secondChar);

        System.out.printf("Changing [%c] to LowerCase gives : [%c] \n",firstChar,result1);
        System.out.printf("Changing [%c] to LowerCase gives : [%c] \n",secondChar,result2);


        
    }
}