/*Create a program to find the youngest friends among 3
 Amar, Akbar, and Anthony based on their ages
  and the tallest among the friends based on their heights
 */

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store the names of friends
        String[] friends = { "Amar", "Akbar", "Anthony" };

        // Array to store the ages of friends
        int[] age = new int[3];

        // Array to store the heights of friends
        double[] height = new double[3];

        // Initialize variables to track the youngest and tallest friend
        int minimumAge = Integer.MAX_VALUE; // Start with a very large number
        int minimumAgeIndex = 0; // To track the index of the youngest friend
        double maximumHeight = Integer.MIN_VALUE; // Start with a very small number
        int maximumHeightIndex = 0; // To track the index of the tallest friend

        // Loop through each friend to get their age and height
        for (int i = 0; i < height.length; i++) {

            // Get the age of the current friend
            System.out.println("Enter the age of " + friends[i]);
            age[i] = sc.nextInt();

            // Update the youngest friend details if the current age is smaller
            if (age[i] < minimumAge) {
                minimumAge = age[i];
                minimumAgeIndex = i;
            }

            // Get the height of the current friend
            System.out.println("Enter the height of " + friends[i]);
            height[i] = sc.nextDouble();

            // Update the tallest friend details if the current height is greater
            if (height[i] > maximumHeight) {
                maximumHeight = height[i];
                maximumHeightIndex = i;
            }
        }

        // Display the results
        System.out.println("The youngest friend is " + friends[minimumAgeIndex] + " and the tallest friend is "
                + friends[maximumHeightIndex]);

        sc.close();
    }
}
