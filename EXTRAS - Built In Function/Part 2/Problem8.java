
// Java program to convert temperatures between Fahrenheit and Celsius
import java.util.Scanner;

public class Problem8 {
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input temperature and conversion choice
        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter 1 to convert to Celsius, 2 to convert to Fahrenheit: ");
        int choice = scanner.nextInt();

        // Perform the chosen conversion
        if (choice == 1) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 2) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}
