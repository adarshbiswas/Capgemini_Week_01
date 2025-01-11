
//Q-12 Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value
//Create a class RandomArrayAnalysis
import java.util.*;

public class RandomArrayAnalysis {

    // Create a method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return randomNumbers;
    }

    // Create a method to find average, minimum, and maximum values of an array
    public double[] findAverageMinMax(int[] numbers) {

        // Take a variable of name min
        int min = numbers[0];

        // Take a variable of name max
        int max = numbers[0];

        // Create a variable sum and assign value 0 into it.
        double sum = 0;

        // Use for loop to calculate sum
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        // Create a variable average to find the value
        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {

        // Create an object analysis to assin value with dot operator
        RandomArrayAnalysis analysis = new RandomArrayAnalysis();

        // Initialize 5 random 4-digit numbers
        int[] randomNumbers = analysis.generate4DigitRandomArray(5);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Find average, min, and max values
        double[] results = analysis.findAverageMinMax(randomNumbers);

        // Display the results
        System.out.printf("Average:", results[0]);
        System.out.printf("Minimum:", results[1]);
        System.out.printf("Maximum:", results[2]);

    }
}
