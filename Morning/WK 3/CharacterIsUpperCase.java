public class CharacterIsUpperCase
{
    public static void main(String[] args)
    {
        char firstChar = 'A';
        char secondChar = 'b';
        boolean result1, result2;

        result1 = Character.isUpperCase(firstChar);
        result2 = Character.isUpperCase(secondChar);

        System.out.printf("Is %c UpperCase (True/False)?: %B \n",firstChar,result1);
        System.out.printf("Is %c UpperCase (True/False)?: %B \n",secondChar,result2);
        

    }
}
