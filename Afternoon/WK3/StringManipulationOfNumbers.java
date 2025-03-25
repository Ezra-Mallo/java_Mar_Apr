public class StringManipulationOfNumbers
{
    public static void main(String[] args)
    {

        String num1 = new String("2000");
        String num2 = "3000";
        String num3;
        num3 = "4000";

        String result1; 
        int result2; 
        double result3; 

        result1 = num1 + num2 + num3;
        System.out.printf("%s + %s + %s = %s. [Adding string variable will concatenates the result]\n", num1, num2, num3, result1);


        result2 = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
        System.out.printf("%s + %s + %s = %s. [Use Integer.parseInt to convert the String into integer\n", num1, num2, num3, result2);


        result3 = Double.parseDouble(num1) + Double.parseDouble(num2) + Double.parseDouble(num3);
        System.out.printf("%s + %s + %s = %s. [Use Double.parseDouble to convert the String into double\n", num1, num2, num3, result3);

    }
}
