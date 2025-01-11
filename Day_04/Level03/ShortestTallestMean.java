// Q.1) Create a program to find the shortest, tallest, and mean height of players present in a football team

// Import the required class for the program
import java.util.Arrays;
import java.util.Scanner;

// Create a class ShortestTallestMean to perform the desired operation
public class ShortestTallestMean {

    // Method to Find the sum of all the elements present in the array.
    public static int findTheSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to find the mean height of the players on the football team
    public static int findMeanHeight(int sumOfElements, int noOfElements) {
        int mean = sumOfElements / noOfElements;
        return mean;
    }

    // Method to find the shortest height of the players on the football team
    public static int findShortestHeight(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    // Method to find the tallest height of the players on the football team
    public static int findTallestHeight(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    // Main method
    public static void main(String[] args) {

        // Create a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the operation we will perform
        System.out.println("Find the shortest, tallest, and mean height of players present in a football team.");

        // Create an int array named heights of size 11
        int heights[] = new int[11];

        // Use for loop to get the height as input and store in the array
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " : ");
            heights[i] = in.nextInt();

            if (heights[i] < 150 || heights[i] > 250) {
                System.err.println("Invalid height! Enter height again: ");
                System.out.print("Enter height of player " + (i + 1) + " : ");
                heights[i] = in.nextInt();
                System.exit(0);
            }
        }

        // Call method findTheSum to Get the sum of all the elements in array
        int sumOfElements = findTheSum(heights);

        // Call method findTheSum to Get the sum of all the elements in array
        int meanHeight = findMeanHeight(sumOfElements, heights.length);
        System.out.println("The mean height is: " + meanHeight + " cms.");

        // Call method findTheSum to Get the sum of all the elements in array
        int shortestHeight = findShortestHeight(heights);
        System.out.println("The shortest height is: " + shortestHeight + " cms.");

        // Call method findTheSum to Get the sum of all the elements in array
        int tallestHeight = findTallestHeight(heights);
        System.out.println("The tallest height is: " + tallestHeight + " cms.");

        // Close the scanner
        in.close();

    }
}
