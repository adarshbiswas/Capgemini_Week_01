/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
 */

import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to input the number of persons
        System.out.println("Enter the number of persons:");
        int personCount = sc.nextInt();

        // Arrays to store weight, height, and BMI of each person
        double[] weight = new double[personCount];
        double[] height = new double[personCount];
        double[] BMI = new double[personCount];

        // Loop through each person to gather their weight and height
        for (int i = 0; i < weight.length; i++) {
            // Get the weight of the current person
            System.out.println("Enter the weight of person " + (i + 1) + " in kg:");
            weight[i] = sc.nextDouble();

            // Get the height of the current person
            System.out.println("Enter the height of person " + (i + 1) + " in meters:");
            height[i] = sc.nextDouble();

            // Calculate the BMI for the current person
            BMI[i] = weight[i] / Math.pow(height[i], 2);

            // Categories for weight status
            String[] WeightStatus = { "Underweight", "Normal", "Overweight", "Obese" };

            // Determine and display the weight status based on BMI
            if (BMI[i] <= 18.4) {
                System.out.println("The Height, Weight, BMI and WeightStatus of person " + (i + 1) + " is " + height[i]
                        + "m, " + weight[i] + "kg, " + BMI[i] + ", " + WeightStatus[0]);
            } else if (BMI[i] <= 24.9) {
                System.out.println("The Height, Weight, BMI and WeightStatus of person " + (i + 1) + " is " + height[i]
                        + "m, " + weight[i] + "kg, " + BMI[i] + ", " + WeightStatus[1]);
            } else if (BMI[i] <= 39.9) {
                System.out.println("The Height, Weight, BMI and WeightStatus of person " + (i + 1) + " is " + height[i]
                        + "m, " + weight[i] + "kg, " + BMI[i] + ", " + WeightStatus[2]);
            } else {
                System.out.println("The Height, Weight, BMI and WeightStatus of person " + (i + 1) + " is " + height[i]
                        + "m, " + weight[i] + "kg, " + BMI[i] + ", " + WeightStatus[3]);
            }
        }

        // Close the scanner
        sc.close();
    }
}
