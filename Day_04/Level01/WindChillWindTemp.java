// Q.11) Write a program calculate the wind chill temperature given the temperature and wind speed

// Import the required class for the program
import java.util.Scanner;

// Create a class WindChillWindTemp to perform the desired operation
public class WindChillWindTemp {

    // Create a method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {

        // Formula to calculate wind chill temperature
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * windSpeed;
        double result = Math.round(windChill * 100.0) / 100.0;

        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Divide N number of chocolates among M children");

        // Get 2 integer input from the user
        System.out.print("Enter the temperature: ");
        double temperature = in.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = in.nextDouble();

        // Create object of the class
        WindChillWindTemp obj = new WindChillWindTemp();
        // Call the method and store the return values in a variable
        double result = obj.calculateWindChill(temperature, windSpeed);

        // Print the output
        System.out.println("The wind chill temperature of the given temperature and wind speed is: " + result);

        // Close the scanner
        in.close();
    }
}
