public class CharacterIsLetterDigit
{
    public static void main(String[] args)
    {
        char firstChar = 'Z';
        char secondChar = '1';
        char ThirdChar = '#';

        boolean result1, result2, result3;

        result1 = Character.isLetterOrDigit(firstChar);
        result2 = Character.isLetterOrDigit(secondChar);
        result3 = Character.isLetterOrDigit(ThirdChar);

        System.out.printf("Is [%c] a Letter or Digit (True/False) : %B \n",firstChar,result1);
        System.out.printf("Is [%c] a Letter or Digit (True/False) : %B \n",secondChar,result2);
        System.out.printf("Is [%c] a Letter or Digit (True/False) : %B \n",ThirdChar,result3);

    }

}