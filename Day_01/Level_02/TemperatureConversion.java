/*Write a TemperaturConversion program, given the temperature in Celsius
 as input outputs the temperature in Fahrenheit*/

//importing the Scanner class for taking user inputs
import java.util.Scanner;

// Creating a TemperaturConversion  Class to convert the temperature in Fahrenheit from Celsius
class TemperatureConversion {

	public static void main(String[] args) {

		// Create an instance of Scanner class to take user inputs
		Scanner sc = new Scanner(System.in);

		// Create an variable named celsius and take input from user
		int celsius = sc.nextInt();

		// Create an variable named fahrenheitResult to store the result
		int fahrenheitResult = (celsius * 9 / 5) + 32;

		// Print the Fahrenheit
		System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

		// Closing the scanner object
		sc.close();

	}
}