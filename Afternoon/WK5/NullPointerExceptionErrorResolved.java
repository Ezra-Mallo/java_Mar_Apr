public class NullPointerExceptionErrorResolved
{
    public static void main(String[] arg)
    {
        String aStr = null;
        int length = aStr.length();
        
        try
        {
            System.out.printf("[%s] contains [%d] characters\n", aStr,length);
        }
        catch(NullPointerException e)
        {
            System.out.println("----------------------------");
            System.out.println("Error: "+ e.getMessage());       
        }
        
        
    }
}