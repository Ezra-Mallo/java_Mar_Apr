import java.util.Scanner;

public class OpenWindowsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an application to open:");
        System.out.println("1. Calculator");
        System.out.println("2. Notepad");
        System.out.println("3. Paint");
        System.out.println("4. Task Manager");
        System.out.println("5. Virtual Keyboard");
        System.out.print("Enter your choice (1-5): ");

        int choice = scanner.nextInt();
        String command = "";

        switch (choice) {
            case 1:
                command = "calc";  // Opens Calculator
                break;
            case 2:
                command = "notepad";  // Opens Notepad
                break;
            case 3:
                command = "mspaint";  // Opens Paint
                break;
            case 4:
                command = "taskmgr";  // Opens Task Manager
                break;
            case 5:
                command = "osk";  // Opens Virtual Keyboard
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                scanner.close();
                return;
        }

        try {
            Runtime.getRuntime().exec(command);
            System.out.println(command + " launched successfully!");
        } catch (Exception e) {
            System.out.println("Error launching " + command + ": " + e.getMessage());
        }

        scanner.close();
    }
}
