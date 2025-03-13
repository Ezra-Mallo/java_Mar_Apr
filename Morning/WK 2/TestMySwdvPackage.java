import swdv.MathsPackagesClass;
import swdv.CalculateArea;
//import swdv.*;     //same as the 2 above

public class TestMySwdvPackage
{
    public static void main(String [] args)
    {
        double a,b, result;

        MathsPackagesClass myMaths = new MathsPackagesClass();
        CalculateArea myArea = new CalculateArea();



        a = 5;
        b = 10;

        result = myMaths.addition(a, b);
        System.out.printf("%.4f + %.4f = %.4f \n",a, b, result);
        System.out.println("--------------------------------------");

        result = myMaths.multiplication(a, b);
        System.out.printf("%.4f * %.4f = %.4f \n",a, b, result);
        System.out.println("--------------------------------------");

        result = myArea.arearOfRectangle(a, b);
        System.out.printf("The area of a retagle with length[%.2f], width [%.2f] = %.4f \n",a, b, result);
        System.out.println("--------------------------------------");


    }
}