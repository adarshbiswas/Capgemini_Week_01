
//Create a program to calculate area of triangle
//Create a class with name Prog12
import java.util.Scanner;

class Area {
	public static void main(String[] args) {

		// Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);

		// Create an integer variable name base to take user input
		int base = input.nextInt();

		// Create an integer variable name height to take user input
		int height = input.nextInt();

		// Create an double variable name feet to calculate value
		double feet = (height / 30.48);

		// Create an integer variable name area to calculate area of triangle
		int area = 1 / 2 * base * height;

		// Create an double variable sq_inches to calculate its value
		double sqinches = (area * 0.155);

		// Display the area of triangle
		System.out.println("Area of triangle is:" + area);
		System.out.println("Height in cm is:" + height + "in feet is:" + feet + "inches is:" + sqinches);

		input.close();

	}
}
