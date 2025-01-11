// Q.12) Write a program to calculate various trigonometric functions using Math class given an angle in degrees

// Import the required class for the program
import java.util.Scanner;

// Create a class TrignometryFunction to perform the desired operation
public class TrignometryFunction {

    // Create a method to calculate various trigonometric functions using Math class
    // given an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {

        // Convert the angle into radians
        double radians = Math.toRadians(angle);

        // Get Sine value
        double sine = Math.sin(radians);
        double sin = Math.round(sine * 100.0) / 100.0;

        // Get Cosine value
        double cosine = Math.cos(radians);
        double cos = Math.round(cosine * 100.0) / 100.0;

        // Get Tangent value
        double tangent = Math.tan(radians);
        double tan = Math.round(tangent * 100.0) / 100.0;

        return new double[] { sin, cos, tan };

    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Calculate various trigonometric functions using Math class given an angle in degrees");

        // Get 2 integer input from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = in.nextDouble();

        // Create object of the class
        TrignometryFunction obj = new TrignometryFunction();
        // Call the method and store the return values in a variable
        double result[] = obj.calculateTrigonometricFunctions(angle);

        // Print the output
        System.out.println("The sine value of entered angle in degree is: " + result[0]);
        System.out.println("The cosine value of entered angle in degree is: " + result[1]);
        System.out.println("The tangent value of entered angle in degree is: " + result[2]);

        // Close the scanner
        in.close();

    }
}
