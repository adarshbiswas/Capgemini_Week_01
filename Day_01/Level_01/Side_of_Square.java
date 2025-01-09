
//Create a program to calculate perimeter of square
//Create a class with name Prog13
import java.util.Scanner;

class Perimeter {
	public static void main(String[] args) {

		// Create an instance of Scanner class to user input
		Scanner input = new Scanner(System.in);

		// Creat a double variable name side to take user input
		double side = input.nextInt();

		// Creat a double variable name perimeter to find its value
		double perimeter = 4 * side;

		// Creat a double variable name area to find its value
		double area = Math.pow(side, 2);

		// Display the value
		System.out.println(
				"The length of side is:" + side + "whose perimeter is:" + perimeter + "And area of square is:" + area);

		input.close();
	}
}