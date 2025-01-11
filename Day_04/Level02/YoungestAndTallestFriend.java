//Q-8 Write a progam to find youngest and tallest among Amar, Akbar and Anthony based on their ages and tallest among the friends
//Create a class YoungestAndTallestFriend

import java.util.Scanner;

public class YoungestAndTallestFriend {

	// Create a method findYoungest to find the youngest age among three
	public static int findYoungest(int ages[]) {

		// Create a variable ageindex to assign value 0
		int ageindex = 0;

		// Use for loop to iterate in the array
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] < ages[ageindex]) {
				ageindex = i;
			}
		}

		// Return the value of youngest age
		return ageindex;
	}

	// Create a method findTallest to find the tallest height among three
	public static int findTallest(int height[]) {

		// Create a variable tallindex and assign value 0.0
		int tallindex = 0;

		// Use for loop to iterate in the array
		for (int i = 0; i < height.length; i++) {
			if (height[i] > height[tallindex]) {
				tallindex = i;
			}
		}

		// Return the value of tallest age
		return tallindex;
	}

	public static void main(String[] args) {

		// Create a Scanner to take input from user
		Scanner input = new Scanner(System.in);

		// Create an array of age name to store ages of all three friends
		int ages[] = new int[3];

		// Create an array of height name to store height of all three friends
		int height[] = new int[3];

		// Create an array of String names to store names of all three friends
		String[] names = { "Amar", "Akbar", "Anthony" };

		// Use for loop to take age array input from user
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the ages of" + names[i]);
			ages[i] = input.nextInt();
		}

		// Use for loop to take height array input from user
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the height of" + names[i]);
			height[i] = input.nextInt();
		}

		// Check youngest and tallest friend
		int ageindex = findYoungest(ages);
		int tallindex = findTallest(height);

		// Display the result
		System.out.println(names[ageindex] + "is the youngest of friends in" + ages[ageindex]);
		System.out.println(names[tallindex] + "is the tallest of friends in" + height[tallindex]);

		// Closing the Scanner
		input.close();
	}
}
