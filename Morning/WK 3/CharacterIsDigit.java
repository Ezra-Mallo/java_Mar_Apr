public class CharacterIsDigit
{
    public static void main(String[] args)
    {
        char firstChar = 'Z';
        char secondChar = '1';
        char ThirdChar = '#';

        boolean result1, result2, result3;

        result1 = Character.isDigit(firstChar);
        result2 = Character.isDigit(secondChar);
        result3 = Character.isDigit(ThirdChar);

        System.out.printf("Is [%c] a digit (True/False) : %B \n",firstChar,result1);
        System.out.printf("Is [%c] a digit (True/False) : %B \n",secondChar,result2);
        System.out.printf("Is [%c] a digit (True/False) : %B \n",ThirdChar,result3);

    }

}