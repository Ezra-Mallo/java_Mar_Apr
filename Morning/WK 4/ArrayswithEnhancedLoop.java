public class ArrayswithEnhancedLoop
{
    public static void main(String[] args)
    {
        int [] numberArrays = {10, 50, 20, 125, 300, 35, 15, 45, 50, 5, 150, 700, 1, 85};

        originalArray(numberArrays);
    }

    public static void originalArray(int[] numbers) // numbers will be same as numberArrays. What matters is the datatype(int[])
    {

        System.out.println("Original value of arrays using [for loop].");

        for(int k = 0; k < numbers.length; ++k )
        {
            System.out.printf("%d, ", numbers[k]);
        }
        
        System.out.println("\n\nOriginal value of arrays using [foreach loop].");

        //see enhanced loop below. Same as what we have above
        for(int number : numbers )
        {
            System.out.printf("%d, ", number);
        }
    }
}