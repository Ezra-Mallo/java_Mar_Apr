public class TestCharacterSWDVClass
{
    public static void main(String[] args)
    {

        char firstChar = 'A';
        char secondChar = 'b';
        char thirdChar = '1';
        char fourthChar = '#';
        boolean result1;
        char  result2;

        System.out.println("---------------------- check IsLowerCaseSWDV-----------------------------------");
        result1 = CharacterSWDV.isLowerCaseSWDV(firstChar);
        System.out.printf("\n[%c] is lowercase (True/ False): %B\n",firstChar,result1);

        result1 = CharacterSWDV.isLowerCaseSWDV(secondChar);
        System.out.printf("\n[%c] is lowercase (True/ False): %B\n",secondChar,result1);
        
        
        System.out.println("---------------------- check IsUpperCaseSWDV-----------------------------------");
        result1 = CharacterSWDV.isUpperCaseSWDV(firstChar);
        System.out.printf("\n[%c] is Uppercase (True/ False): %B\n",firstChar,result1);

        result1 = CharacterSWDV.isUpperCaseSWDV(secondChar);
        System.out.printf("\n[%c] is Uppercase (True/ False): %B\n",secondChar,result1);
        
        
        
       System.out.println("---------------------- check IsDigitSWDV-----------------------------------");

        result1 = CharacterSWDV.isDigitSWDV(firstChar);
        System.out.printf("\n[%c] is digit (True/ False): %B\n",firstChar,result1);

        result1 = CharacterSWDV.isDigitSWDV(secondChar);
        System.out.printf("\n[%c] is digit (True/ False): %B\n",secondChar,result1);

        result1 = CharacterSWDV.isDigitSWDV(thirdChar);
        System.out.printf("\n[%c] is digit (True/ False): %B\n",thirdChar,result1);

        
        System.out.println("---------------------- check toUpperCaseSWDV-----------------------------------");
        result2 = CharacterSWDV.toUpperCaseSWDV(firstChar);
        System.out.printf("\nConverting [%c] is upper give [%c]\n",firstChar,result2);

        result2 = CharacterSWDV.toUpperCaseSWDV(secondChar);
        System.out.printf("\nConverting [%c] is upper give [%c]\n",firstChar,result2);
        

    }
}