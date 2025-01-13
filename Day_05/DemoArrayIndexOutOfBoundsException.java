// Q.8) Write a program to demonstrate ArrayIndexOutOfBoundsException

// Import the required class for the program
import java.util.Scanner;

public class DemoArrayIndexOutOfBoundsException {

    // Create generateException method to generate the run-time exception
    public static void generateException(String names[]) {

        String result = names[4];
        System.out.println(result);
    }

    // Create handleException method to generate the run-time exception
    public static void handleException(String names[]) {

        try {
            String result = names[4];
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is a ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred : " + e.getMessage());
        }

    }

    // Create a main method
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner in = new Scanner(System.in);

        String names[] = new String[3];
        // Take string input from the user
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = in.nextLine();
        }

        // Try to call the generateException method to generate the exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException(names);

        // Close the scanner class
        in.close();
    }
}
