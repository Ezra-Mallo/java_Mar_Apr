public class CharacterIsUpperCase
{   
    public static void main(String[] args)
    {

        char firstChar = 'C';
        char secondChar = 'd';

        boolean result1, result2;

        result1 = Character.isUpperCase(firstChar);
        result2 = Character.isUpperCase(secondChar);

        System.out.printf("\n[%c] is uppercase (True/ False): %B",firstChar,result1);
        System.out.printf("\n[%c] is uppercase (True/ False): %B",secondChar,result2);
    }

}