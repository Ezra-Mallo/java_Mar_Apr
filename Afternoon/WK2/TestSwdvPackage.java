import swdv.MathsCalculationsPackage;
import swdv.ComputeAreas;

// the line below will import the 2 above and any other class in that folder
//import swdv.*

public class TestSwdvPackage
{
    public static void main (String[] args)
    {
        double num1, num2 , result;

        MathsCalculationsPackage myMath = new MathsCalculationsPackage();

        num1 = 5;
        num2 = 10;

        result = myMath.addition(num1, num2);
        System.out.printf("%.2f + %.2f = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
        
        result = myMath.subtraction(num1, num2);
        System.out.printf("%.2f - %.2f = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
        
        result = myMath.multiplication(num1, num2);
        System.out.printf("%.2f * %.2f = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
        

        result = myMath.division(num1, num2);
        System.out.printf("%.2f / %.2f = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
        
        result = myMath.modulus(num1, num2);
        System.out.printf("%.2f modulus %.2f = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
        
        ComputeAreas myArea = new ComputeAreas();

        result = myArea.areaOfCircle(num1);
        System.out.printf("The area of a circle with radius %.2f  = %.2f \n", num1, result);
        System.out.println("-----------------------------------------------");

        result = myArea.areaOfRectangle(num1, num2);
        System.out.printf("The area of a circle with with length [%.2f] and [%.2f]  = %.2f \n", num1, num2, result);
        System.out.println("-----------------------------------------------");
    }
}