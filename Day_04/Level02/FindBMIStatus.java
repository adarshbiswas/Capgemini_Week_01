
//Q-10  a program to find the BMI and display the height, weight, BMI and status of each individual
//Write a class name FindBMIStatus
import java.util.Scanner;

public class FindBMIStatus {

    ///Create a method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Create a method to determine BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {

        // Create a Scanner class to take input from user
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store weight, height, and BMI of 10 persons
        double[][] data = new double[10][3];

        // Create a variable to take input from user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the weight (in kg) of person " + (i + 1) + ":");
            data[i][0] = scanner.nextDouble();

            System.out.println("Enter the height (in cm) of person " + (i + 1) + ":");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Display the results
        System.out.println("Weight(kg), Height(cm), BMI, Status");

        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            String status = determineBMIStatus(bmi);
            System.out.println(data[i][0] + data[i][1] + bmi + status);
        }

        // Close the Scanner
        scanner.close();
    }
}
