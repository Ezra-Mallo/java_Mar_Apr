public class TestingOurSWDVCharacterClassAndMethods
{
    public static void main(String[] args)
    {
        char firstChar = 'A';
        char secondChar = 'b';        
        char thirdChar = '1';
        char fourthChar = '#';

        boolean result1;
        char result2;


        System.out.printf("-----------------Check IsLowerCaseSWDV Method----------------------------\n");
        result1 = CharacterSWDV.isLowerCaseSWDV(firstChar);
        System.out.printf("Is  [%c] LowerCase gives : [%B] \n",firstChar,result1);
        
        result1 = CharacterSWDV.isLowerCaseSWDV(secondChar);
        System.out.printf("Is  [%c] LowerCase gives : [%B] \n",secondChar,result1);
        


        System.out.printf("-----------------Check IsUpperCaseSWDV Method----------------------------\n");
        result1 = CharacterSWDV.isUpperCaseSWDV(firstChar);
        System.out.printf("Is  [%c] upperCase gives : [%B] \n",firstChar,result1);
        
        result1 = CharacterSWDV.isUpperCaseSWDV(secondChar);
        System.out.printf("Is  [%c] UpperCase gives : [%B] \n",secondChar,result1);

        
        System.out.printf("-----------------Check tolowerCaseSWDV Method----------------------------\n");
        result2 = CharacterSWDV.toLowerCaseSWDV(firstChar);
        System.out.printf("Changing [%c] to LowerCase gives : [%c] \n",firstChar,result2);


        result2 = CharacterSWDV.toLowerCaseSWDV(secondChar);
        System.out.printf("Changing [%c] to LowerCase gives : [%c] \n",secondChar,result2);  

        System.out.printf("-----------------Check toUpperCaseSWDV Method----------------------------\n");

        result2 = CharacterSWDV.toUpperCaseSWDV(firstChar);
        System.out.printf("Changing [%c] to UpperCase gives : [%c] \n",firstChar,result2);


        result2 = CharacterSWDV.toUpperCaseSWDV(secondChar);
        System.out.printf("Changing [%c] to UpperCase gives : [%c] \n",secondChar,result2);  




        
    }
}