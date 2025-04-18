public class ArraysDemo
{
    public static void main (String[] args)
    {
        double number1 = 10;
        double number2 = 15;
        double number3 = 20;
        double number4 = 25;
        double number5 = 30;
        double number6 = 35;
        double number7 = 40;
        double number8 = 45;
        double number9 = 50;
        double number10 = 55; 
        double sum, average;

        sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
        average = sum / 10;

        System.out.println("No Array");
        System.out.printf("Sum = %.2f, Average = %.2f\n\n", sum, average);

        
        double[] numbers = new double[10];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;
        numbers[5] = 35;
        numbers[6] = 40;
        numbers[7] = 45;
        numbers[8] = 50;
        numbers[9] = 55; 


        sum = 0;
        average = 0;

        sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + 
              numbers[6] + numbers[7] + numbers[8] + numbers[9] ;
        average = sum / 10;

        System.out.println("Using  Array Demo 1");        
        System.out.printf("Sum = %.2f, Average = %.2f\n\n", sum, average);
        


        double[] scores = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
        sum = 0;
        average = 0;
        for (int k = 0; k < 10; k++)
        {
            sum = sum + scores[k];
        }
        average = sum / 10;

        System.out.println("Using  Array and Loop Demo 2");        
        System.out.printf("Sum = %.2f, Average = %.2f\n\n", sum, average);       

    }
}
