public class StringManipulationOfNumbers
{
    public static void main(String[] args)
    {
        String num1 ="2000";
        String num2 ="3000";
        String  result1 ;
        int result2;
        double result3;


        result1 =  num1 + num2;
        System.out.printf("%s + %s = %s. [Adding 2 string concatenates it]\n", num1, num2, result1);    

        
        result2 =  Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.printf("%s + %s = %s. [Used Integer.parseInt to convert the string to Integer before addition.]\n", num1, num2, result2);      

        result3 =  Double.parseDouble(num1) + Double.parseDouble(num2);
        System.out.printf("%s + %s = %s. [Used Double.parseDouble to convert the string to Double before addition.]\n", num1, num2, result3);  

    }
}