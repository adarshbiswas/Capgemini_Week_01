/*Write a TemperaturConversion program, given the temperature in Fahrenheit
 as input and outputs the temperature in Celsius */

//importing the Scanner class for taking user inputs
import java.util.Scanner;

// Creating a TemperaturConversion2  Class to convert the temperature in Celsius from Fahrenheit  
class TemperatureConversion2 {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named fahrenheit and take input from user
		int fahrenheit = sc.nextInt();

		// Create an variable named fahrenheitResult to store the result
		int celsiusResult = (fahrenheit - 32) * 5 / 9;

		// Print the Fahrenheit
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

		// Closing the scanner object
		sc.close();

	}
}