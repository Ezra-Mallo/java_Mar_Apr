public class ArithmeticComputationDemo2
{
    public static void main(String[] args)
    {
        float a = 40;
        float b = 30;
        double mainResult;

        System.out.println("This is main method");
        addition(a, b);   
        System.out.println("Returned back to main method");



        mainResult = subtraction(a, b);
        System.out.printf("\n%.2f - %.2f = %.2f %n",a,b,mainResult );    
        
        mainResult = multiplication(a, b);
        System.out.printf("%.2f * %.2f = %.2f %n",a,b,mainResult );    

        mainResult = division(a, b);
        System.out.printf("%.2f / %.2f = %.2f %n",a,b,mainResult );    

        mainResult = modulus(a, b);
        System.out.printf("%.2f %% %.2f = %.2f %n",a,b,mainResult );    


    }

    public static void addition(float a, float b)
    {
        
        System.out.println("This is addition  method");
        double result = a + b;
        
        System.out.printf("%.2f + %.2f = %.2f %n",a,b,result );              
        System.out.println("Leaving addition  method");
    }


    public static double subtraction(float x, float y)
    {
        
        double result = x - y;        
        return     result;      

    }



    public static double multiplication(float x, float y)
    {               
        return     x * y;      
    }


    public static double division(float x, float y)
    {               
        return     x / y;      
    }

    public static double modulus(float x, float y)
    {               
        return     x % y;      
    }
}