public class CharacterSWDV
{
    public static boolean isUpperCaseSWDV(char ch)
    {
        if(ch >=65 && ch <=90)    //
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static boolean isLowerCaseSWDV(char ch)
    {
        if(ch >=97 && ch <=122)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static boolean isDigitSWDV(char ch)
    {
        if(ch >=48 && ch <=57)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static char toLowerCaseSWDV(char ch)
    {
        if(ch >=65 && ch <=90)    //
        {
            int newChar = (int) ch;             
            return (char) (newChar + 32);
        }
        else
        {
            return ch;
        }
    }


        public static char toUpperCaseSWDV(char ch)
    {
        if(ch >=97 && ch <=122)
        {
            int newChar = (int) ch;
            return (char) (newChar - 32);

        }
        else
        {
            return ch;
        }
    }
}