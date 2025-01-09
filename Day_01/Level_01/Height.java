//Create a program to calculate height in feet and inches
//Create a Class with Prog10

import java.util.Scanner;

class Height {
	public static void main(String[] args) {

		// Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);

		// Create an integer variable centimeters and assign value from user
		int centimeters = input.nextInt();

		// Create an double variable height to calculate in feet
		double feet = (centimeters / 30.48);

		// Create a double variable modulo to take modulous value of feet
		double modulo = ((centimeters / 30.48) * 100) % 100;

		// Create a double variable inches to take final value in inches
		double inches = 12 * modulo;

		// Display the height
		System.out.println("Height in Feet is" + feet + "Height in inches is:" + inches);

		input.close();
	}
}