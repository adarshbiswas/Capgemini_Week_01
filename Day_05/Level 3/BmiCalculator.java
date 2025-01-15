// Q.1) An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual

// Import the required class for the program
import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[10][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(personData[i][1]); // Height
            result[i][1] = String.valueOf(weight); // Weight
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }

        return result;
    }

    // Method to display the results in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2]; // Height and Weight of 10 members

        // Taking input for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] result = calculateBMI(personData);

        // Display the result
        displayResult(result);

        scanner.close();
    }
}
