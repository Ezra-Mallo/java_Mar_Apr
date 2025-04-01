public class NullPointerExceptionError
{
    public static void main(String[] arg)
    {
        String aStr = null;
        int length = aStr.length();
        
        System.out.printf("[%s] contains [%d] characters\n", aStr,length);
        
    }
}