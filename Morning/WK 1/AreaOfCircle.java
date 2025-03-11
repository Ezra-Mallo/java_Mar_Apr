import java.util.Scanner;

public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner KeyEntry = new Scanner(System.in);
        final float PI = 3.142f;
        float r;
        float area;
        float circumference;

        System.out.print("Enter the radius:");
        r = KeyEntry.nextFloat();

        area = PI * (r * r);
        circumference  = 2 * PI * r;
        System.out.printf("The area of a circle with radius (%.2f) = %.2f\n", r, area );
        System.out.printf("The circumference of a circle with radius (%.2f) = %.2f\n", r, circumference );


    }
}