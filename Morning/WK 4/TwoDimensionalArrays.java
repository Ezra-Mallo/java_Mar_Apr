import java.util.Arrays;

public class TwoDimensionalArrays
{
    public static void main(String[] args)
    {
        int[] [] firstMatrix  = new int[2][3];


        firstMatrix [0][0] = 1;
        firstMatrix [0][1] = 2;
        firstMatrix [0][2] = 3;

        firstMatrix [1][0] = 4;
        firstMatrix [1][1] = 5;
        firstMatrix [1][2] = 6;

        //int[] [] secondMatrix  = {{11, 12, 13},{14, 15, 16}};
        int[] [] secondMatrix  = {
                                    {11, 12, 13},
                                    {14, 15, 16}
                                };
        printArray(firstMatrix);
        System.out.println("---------------");
        printArray(secondMatrix);
        System.out.println("---------------");


        addArray(firstMatrix, secondMatrix);
        System.out.println("---------------");

    }



    public static void addArray(int[][] firstMatrix, int[][] secondMatrix)
    {
        int[] [] sumMatrix  = new int[2][3];
        for (int row=0; row < 2; row++)
        {
            for(int col=0; col < 3; col++)
            {
                sumMatrix[row][col] = firstMatrix[row][col] +  secondMatrix[row][col];
            }
        }    
        printArray(sumMatrix);
    }



    public static void printArray(int[][] myMatrix)
    {
        for (int row=0; row < 2; row++)
        {
            for(int col=0; col < 3; col++)
            {
                System.out.printf("%d, ",myMatrix[row][col]);
            }
            System.out.println();
        }
    }
}