public class CharacterIsDigit
{   
    public static void main(String[] args)
    {

        char firstChar = 'C';
        char secondChar = '1';
        char thirdChar = '$';

        boolean result1, result2, result3;

        result1 = Character.isDigit(firstChar);
        result2 = Character.isDigit(secondChar);
        result3 = Character.isDigit(thirdChar);

        System.out.printf("\nIs [%c] a digit (True/ False): %B",firstChar,result1);
        System.out.printf("\nIs [%c] a digit (True/ False): %B",secondChar,result2);
        System.out.printf("\nIs [%c] a digit (True/ False): %B",thirdChar,result3);
    }

}