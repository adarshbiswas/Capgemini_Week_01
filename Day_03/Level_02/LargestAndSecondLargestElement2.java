/*Rework the program 2, especially the Hint f where if index equals maxDigit, 
we break from the loop. Here we want to modify to Increase the size of the array i,
e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number */

import java.util.Scanner;

public class LargestAndSecondLargestElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        long number = sc.nextLong(); // Read long input for larger numbers

        // Initial size of the digits array
        int maxDigit = 10;

        // Array to store digits of the number
        int[] digits = new int[maxDigit];

        int index = 0;

        // Extract digits from the number
        while (number > 0) {
            if (index == maxDigit) {
                // Dynamically increase size of the array
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            // Store the current digit and increment index
            digits[index] = (int) (number % 10);
            index++;
            number /= 10;
        }

        // Find the largest and second-largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // Display the result
        System.out.println("The largest digit is " + largest);
        if (secondLargest != -1) {
            System.out.println("The second largest digit is " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        sc.close();
    }
}
