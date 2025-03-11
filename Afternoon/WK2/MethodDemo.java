public class MethodDemo
{
    public static void main(String[] args)
    {
        float num1 = 30, num2 = 40, num3 = 50, num4= 100, result;


        result = num1 + num2 + num3;

        System.out.printf("%.2f + %.2f + %.2f = %.2f \n", num1, num2, num3, result);
        System.out.printf("------------------------------\n");

        result = add(num1, num2);  // call to a method that takes 2 arguments/parameters and returns a value
        System.out.printf("%.2f + %.2f = %.2f \n", num1, num2, result);
        System.out.printf("------------------------------\n");


        result = add(num1, num2, num3);  // call to a method that takes 3 arguments/parameters and returns a value
        System.out.printf("%.2f + %.2f + %.2f = %.2f \n", num1, num2, num3, result);
        System.out.printf("------------------------------\n");


        double total = add(num1, num2, num3,  num4);  // call to a method that takes 4 arguments/parameters and returns a value
        System.out.printf("%.2f + %.2f + %.2f + %.2f = %.2f \n", num1, num2, num3, num4, total);
        System.out.printf("------------------------------\n");

        displayVoidMethod();   // call to a method with 0 argument and void return type.
    }

    public static void displayVoidMethod()
    {
        System.out.printf("That is the end of our calculation. Good bye.");
    }

    public static float add(float num1, float num2)
    {
        float sum = num1 + num2;        
        return sum;        
    }

    
    public static float add(float num1, float num2, float num3)
    {
        float sum = num1 + num2 + num3;        
        return sum;        
    }

        
    public static double add(float num1, float num2, float num3, float num4)
    {
        double sum = num1 + num2 + num3 + num4;        
        return sum;        
    }
}