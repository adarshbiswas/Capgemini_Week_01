
//Create a program to find distance in yards
//Create a class with name Distance
import java.util.Scanner;

class Distance {
	public static void main(String[] args) {

		// Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);

		// Create an integer variable feet to take user input
		int feet = input.nextInt();

		// Create an integer variable yard to find its value
		int yard = feet / 3;

		// Create an integer variable mile to find its value
		int mile = yard / 1760;

		// Create a double variable centimeter to find its value
		double centimeter = feet * 30.48;

		// Create a double variable modulo to find its value
		double modulo = ((centimeter / 30.48) / 100) % 100;

		// Create a double variable inches to find its value
		double inches = 12 * modulo;

		// Display the result
		System.out.println("Height in cm is:" + centimeter + "while in feet is:" + feet + "inches is:" + inches);

		input.close();
	}
}
