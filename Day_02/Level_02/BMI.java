//Create a program to find the BMI of a person

// Import the scanner class 
import java.util.Scanner;

// Create class name BMI
public class BMI {
        public static void main(String[] args) {

                // Create a Scanner object to take input from the user
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter your weight(in kg): ");
                // create double variable weight and assign input from the user
                double weight = sc.nextDouble();

                System.out.print("Enter your height(in cm): ");
                // create double variable heightInCm and assign input from the user
                double heightInCm = sc.nextDouble();

                // Converting height from cm to meters
                double heightInMeters = heightInCm / 100.0;

                // Computing BMI
                double bmi = weight / (heightInMeters * heightInMeters);

                System.out.println("Your BMI is: " + bmi);

                // checking the weight status based on the BMI value
                String result;

                if (bmi < 18.4) {
                        result = "Underweight";
                } else if (bmi >= 18.5 && bmi < 24.9) {
                        result = "Normal weight";
                } else if (bmi >= 25 && bmi < 39.9) {
                        result = "Overweight";
                } else {
                        result = "Obesity";
                }

                // declare the result
                System.out.println("The weight status of the person: " + result);

                // Close the Scanner Object
                sc.close();
        }
}
