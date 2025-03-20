public class CharacterIsLowerCase
{   
    public static void main(String[] args)
    {

        char firstChar = 'A';
        char secondChar = 'b';

        boolean result1, result2;

        result1 = Character.isLowerCase(firstChar);
        result2 = Character.isLowerCase(secondChar);

        System.out.printf("\n[%c] is Lowercase (True/ False): %B",firstChar,result1);
        System.out.printf("\n[%c] is Lowercase (True/ False): %B",secondChar,result2);
    }

}