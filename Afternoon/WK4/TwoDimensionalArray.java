import java.util.Arrays;

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        int[][] firstMatrix = new int[2][3];

        

        firstMatrix[0][0] = 1;
        firstMatrix[0][1] = 2;
        firstMatrix[0][2] = 3;

        firstMatrix[1][0] = 4;
        firstMatrix[1][1] = 5;
        firstMatrix[1][2] = 6;

        //int[][] secondMatrix = {{11, 12, 13}, {14, 15, 16}};
        int[][] secondMatrix = {
            {11, 12, 13}, 
            {14, 15, 16}
        };
         
        System.out.println("----first Matrix-----");
        printMyArray(firstMatrix);
        System.out.println("----second Matrix----");
        printMyArray(secondMatrix);
        System.out.println("----Sum of Matrix----");
        addTwoDimArray(firstMatrix, secondMatrix);
    }

    
    
    public static void printMyArray(int[][] numberList) // here the numberList = numberArray because both are same type(int[])
    {        
        for(int row = 0; row < 2; ++row)
        {
            for(int column = 0; column < 3; ++column)
            {
                System.out.printf("%d, ", numberList[row][column]);
            }
            System.out.println();
        }        


    }
    
    
    public static void addTwoDimArray(int[][] firstMatrix, int[][] secondMatrix)
    {
        int [][] sumMatrix = new int[2][3];

        for(int row = 0; row < 2; ++row)
        {
            for(int column = 0; column < 3; ++column)
            {

            sumMatrix[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
            }
        }
        printMyArray(sumMatrix);

    }
}