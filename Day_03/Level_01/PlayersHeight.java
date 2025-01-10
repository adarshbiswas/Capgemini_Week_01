//Q-6)
//Create a program mean height of players
//Create a class name PlayersHeight

import java.util.Scanner;

public class PlayersHeight {
	public static void main(String[] args) {

		// Create a Scanner Object
		Scanner input = new Scanner(System.in);

		///Declare the value of 2D-Array
		int arr[][] = new int[6][5];

		// Input the element of 2D-Array
		System.out.println("Enter the height of football players in cm:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = input.nextInt();
			}
		}

		// Calculate the sum of all elements in array
		int sum = 0;
		System.out.println("The sum of height of football players:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "");
				sum += arr[i][j];
			}
			System.out.println();
		}

		// Calculate mean height of all football team
		int mean = sum / 11;

		// Display the result
		System.out.println("The mean height of football team is:" + mean);

		// Close the scanner object;
		input.close();
	}
}