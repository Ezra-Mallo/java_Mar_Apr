public class CharacterIsLowerCase
{
    public static void main(String[] args)
    {
        char firstChar = 'A';
        char secondChar = 'b';

        boolean result1, result2;

        result1 = Character.isLowerCase(firstChar);
        result2 = Character.isLowerCase(secondChar);

        System.out.printf("Is %c LowerCase(True/False)?: %B \n",firstChar,result1);
        System.out.printf("Is %c LowerCase(True/False)?: %B \n",secondChar,result2);
        


        


    }
}