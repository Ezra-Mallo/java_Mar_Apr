public class DemoMethods
{
    public static void main(String[] args)
    {

        float num1 = 30, num2= 40, num3 = 50, num4 = 70, result ;

        /* result = num1 + num2 + num3;

        System.out.println("The result is " + result);
        System.out.println("-----------------------------");

        */


        //demostrating method overload
        result = add(num1, num2);   // call a method with 2 arguments and that will return a value
        System.out.printf("%.2f + %.2f = %.2f ", num1, num2, result );
        System.out.println("\n-----------------------------");



        result = add(num1, num2, num3);   // call a method with 3 arguments and that will return a value
        System.out.printf("%.2f + %.2f + %.2f= %.2f ", num1, num2, num3, result );
        System.out.println("\n-----------------------------");


        double result2 = add(num1, num2, num3, num4);   // call a method with 4 arguments and that will return a value
        System.out.printf("%.2f + %.2f + %.2f + %.2f= %.2f ", num1, num2,num3, num4, result2 );
        System.out.println("\n-----------------------------");



        
        displayVoidMethod();   // call a method that will not return a value
    }


    public static void displayVoidMethod()
    {
        System.out.println("This is the end of the programming. Bye for now");
    }

    public static float add(float a, float b)
    {
        float result = a + b;
        return result;
    }

    public static float add(float num1, float num2, float num3)
    {
        float result = num1 + num2 + num3;
        return result;
    }

    public static double add(float num1, float num2, float num3, float num4)
    {
        double result = num1 + num2 + num3 + num4;
        return result;
    }
}