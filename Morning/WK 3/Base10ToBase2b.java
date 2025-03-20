import java.util.Scanner;
import java.util.Stack;

public class Base10ToBase2b {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        int number;

        System.out.print("Enter a decimal number to be converted to binary: ");
        number = inputKey.nextInt();  
        
        if (number == 0) {
            System.out.println("Binary: 0");
            return;
        }

        Stack<Integer> binaryStack = new Stack<>(); // To store remainders in correct order
        
        while (number > 0) {
            binaryStack.push(number % 2); // Store remainder
            number /= 2; // Update number by integer division
        }
        
        System.out.print("Binary: ");
        while (!binaryStack.isEmpty()) {
            System.out.print(binaryStack.pop()); // Print in correct order
        }
    }
}
