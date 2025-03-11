public class ArithmeticComputation
{
    public static void main(String[] args)
    {
        float a = 40;
        float b = 30;
        double result;

        
        result = a + b;

        System.out.printf("%.2f + %.2f = %.2f %n",a,b,result );
        System.out.println();



        result = a - b;

        System.out.printf("%.2f - %.2f = %.2f %n",a,b,result );
        System.out.println();


        result = a * b;

        System.out.printf("%.2f * %.2f = %.2f %n",a,b,result );
        System.out.println();



        result = a / b;

        System.out.printf("%.2f / %.2f = %.2f %n",a,b,result );
        System.out.println();


        result = a % b;

        System.out.printf("%.2f - %.2f = %.2f %n",a,b,result );
        System.out.println();
    }
}