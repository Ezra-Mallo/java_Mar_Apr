import java.util.Scanner;

public class AreaofTriangleParellegram
{
    public static void main(String[] args)
    {
        Scanner KeyEntry = new Scanner (System.in);

        float base, height;
        double mainResult;

        System.out.print("Enter the value of base:");
        base = KeyEntry.nextFloat();

        System.out.print("Enter the value of height:");
        height = KeyEntry.nextFloat();

        mainResult= areaOfTri(base, height);        
        System.out.printf(" The area of a Triangle with base(%.2f) and heigh(%.2f) = %.2f \n",base, height, mainResult);

        mainResult= areaOfPara(base, height);        
        System.out.printf(" The area of a Parallelogram with base(%.2f) and heigh(%.2f) = %.2f \n",base, height, mainResult);

    }

    public static double areaOfTri(float base, float height) 
    {
        return (0.5 * base * height);
    }

    public static double areaOfPara(float base, float height) 
    {
        return (base * height);
    }
}
        