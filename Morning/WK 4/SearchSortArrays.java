import java.util.Scanner;

public class SearchSortArrays
{
    public static void main(String[] args)
    {
        int [] numberArrays = {10, 50, 20, 125, 300, 35, 15, 45, 50, 5, 150, 700, 1, 85};

        Scanner keyEntry = new Scanner(System.in);
        int searchNumber;

        System.out.println("\nOriginal value of arrays using [foreach loop].");
        printArray(numberArrays);

        System.out.print("\nEnter the value to search for: ");
        searchNumber = keyEntry.nextInt();

        String stringReturned = searchForValue(searchNumber,  numberArrays);

        System.out.printf("The number [%d] is %s",searchNumber, stringReturned);

        bubbleSortingAscending(numberArrays);
        bubbleSortingDescending(numberArrays);


        //     




    }

    public static void printArray(int[] numbers) // numbers will be same as numberArrays. What matters is the datatype(int[])
    {
        for(int number : numbers )
        {
            System.out.printf("%d, ", number);
        }
        System.out.println();

    }


    
    public static String searchForValue(int searchNumber, int[]  numberArrays)
    {
        String returnStringValue = "Not Found.";
        for(int k = 0; k < numberArrays.length; ++k )
        {
            if (numberArrays[k] == searchNumber)
            {
                returnStringValue ="Found.";
            }
        }

        /*
        for(int number : numberArrays )
        {
            
            if (num == searchNumber);
            {
                returnStringValue ="Found.";
            }
        }
         */
        return returnStringValue;
    }

    public static void bubbleSortingAscending(int[] numberArrays)
    {
        for (int j = 0; j < numberArrays.length; j++)
        {
            int tempData;
            int newLength =  numberArrays.length - 1;
            for (int k = 0; k < newLength ; k++)
            {
                if (numberArrays[k] > numberArrays[k+1] )
                {
                    //Swapping
                    tempData = numberArrays[k];
                    numberArrays[k] = numberArrays[k+1];
                    numberArrays[k+1] = tempData;
                }
            }
        }
        System.out.println("\nSorted in Ascending Order");
        printArray(numberArrays);  
    }


    public static void bubbleSortingDescending(int[] numberArrays)
    {
        for (int j = 0; j < numberArrays.length; j++)
        {
            int tempData;
            int newLength =  numberArrays.length - 1;
            for (int k = 0; k < newLength ; k++)
            {
                if (numberArrays[k] < numberArrays[k+1] )
                {
                    //Swapping
                    tempData = numberArrays[k];
                    numberArrays[k] = numberArrays[k+1];
                    numberArrays[k+1] = tempData;
                }

            }
        }
        System.out.println("\nSorted in Ascending Order");
        printArray(numberArrays);  
    }
}