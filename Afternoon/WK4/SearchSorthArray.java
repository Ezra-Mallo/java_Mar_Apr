import java.util.Scanner;

public class SearchSorthArray
{
    public static void main(String[] args)
    {
        int[] numberArray = {100, 15, 200, 25, 30, 135, 40, 5, 50, 55, 700, 1, 257, 67, 85, 101};
        Scanner keyInput = new Scanner(System.in);

        int searchNumber;

        System.out.println("\nOriginal Value.");
        printMyArray(numberArray);

        System.out.print("\nEnter the number to search: ");
        searchNumber = keyInput.nextInt();

        String searchResultReturned = searchForNumberInArray(searchNumber, numberArray);
        System.out.printf("\nThe number [%d] you entered is %s\n", searchNumber, searchResultReturned);


        System.out.println("\nSort Array in Ascending Order.");
        bubbleSortAscendingOrder(numberArray);

        System.out.println("\n\nSort Array in Descending Order.");
        bubbleSortDescendingOrder(numberArray);
    }



    public static void printMyArray(int[] numberList) // here the numberList = numberArray because both are same type(int[])
    {        
        System.out.printf("Using [for loop].\n");
        for(int k = 0; k < numberList.length; ++k)
        {
            System.out.printf("%d, ", numberList[k]);
        }        
        System.out.printf("\nUsing [foreach loop].\n");

        //num = numberList.length -1        
        for(int number : numberList)
        {
            System.out.printf("%d, ", number);
        }
    }



    public static String searchForNumberInArray(int searchNumber, int[] numberList)
    {
        String returnedString = "Not Found.";
        for(int k = 0; k < numberList.length; ++k)
        {
             if (searchNumber == numberList[k])
             {
                returnedString = "Found.";             
             }
        }
        return returnedString;
    }

    public static void bubbleSortAscendingOrder(int[] numberArray)
    {
        for (int j = 0; j < numberArray.length; j++ )
        {
            int tempDataHolder;
            int newLength = numberArray.length - 1;

            for (int k = 0; k < newLength ; k++ )
            {
                if (numberArray[k] > numberArray[k+1])
                {
                    //swapping
                    tempDataHolder = numberArray[k];
                    numberArray[k] = numberArray[k+1];
                    numberArray[k+1] = tempDataHolder;
                }
            }
        }
        printMyArray(numberArray);
    }
    

    public static void bubbleSortDescendingOrder(int[] numberArray)
    {
        for (int j = 0; j < numberArray.length; j++ )
        {
            int tempDataHolder;
            int newLength = numberArray.length - 1;

            for (int k = 0; k < newLength ; k++ )
            {
                if (numberArray[k] < numberArray[k+1])
                {
                    //swapping
                    tempDataHolder = numberArray[k];
                    numberArray[k] = numberArray[k+1];
                    numberArray[k+1] = tempDataHolder;
                }
            }
        }
        printMyArray(numberArray);

    }

}