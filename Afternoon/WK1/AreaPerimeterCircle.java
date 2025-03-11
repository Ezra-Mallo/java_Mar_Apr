import java.util.Scanner;

public class AreaPerimeterCircle
{
    public static void main(String[] arg)
    {
            Scanner KeyInput = new Scanner(System.in);
            //A = π × r2	
            //Circumference = 2πr

            final float PI = 3.142f;
            float radius;
            double area;
            double circumference;

            System.out.print("Enter the radius: ");
            radius = KeyInput.nextFloat();

            area = PI * (radius * radius);
            circumference = 2 * PI * radius;

            System.out.println();
            
            System.out.printf("The area of a circle with radius(%.4f) is %.4f \n", radius, area);
            System.out.printf("The circumference of a circle with radius(%.4f) is %.4f\n", radius, circumference);
            

    }
}