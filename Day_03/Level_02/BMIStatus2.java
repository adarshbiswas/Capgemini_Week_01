/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array */

import java.util.Scanner;

public class BMIStatus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.println("Enter the number of persons:");
        int personCount = sc.nextInt();

        // Initialize 2D array to store weight, height, and BMI
        double[][] personData = new double[personCount][3]; // [][0] = Weight, [][1] = Height, [][2] = BMI
        String[] weightStatus = new String[personCount]; // To store weight status

        // Loop to input weight, height, and calculate BMI for each person
        for (int i = 0; i < personCount; i++) {
            // Input weight
            System.out.println("Enter the weight of person " + (i + 1) + " in kg:");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.err.println("Invalid weight. Please enter a positive value.");
                weight = sc.nextDouble();
            }
            personData[i][0] = weight;

            // Input height
            System.out.println("Enter the height of person " + (i + 1) + " in meters:");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.err.println("Invalid height. Please enter a positive value.");
                height = sc.nextDouble();
            }
            personData[i][1] = height;

            // Calculate BMI and store it in personData
            double bmi = weight / Math.pow(height, 2);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and status for each person
        System.out.println("\nHeight, Weight, BMI, and Weight Status for each person:");
        for (int i = 0; i < personCount; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
