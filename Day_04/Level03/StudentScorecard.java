package Day_04.Level_03;

/*Question 12: Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
 */

import java.util.Random;

public class StudentScorecard {

    // Generates random 2-digit scores for Physics, Chemistry, and Math (PCM)
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Random score for Physics
            scores[i][1] = 10 + random.nextInt(90); // Random score for Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Random score for Math
        }

        return scores;
    }

    // Calculates the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Sum of PCM scores
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage calculation

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round off to 2 digits
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round off to 2 digits
        }

        return results;
    }

    // Displays the scorecard of all students in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("Student#\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10; // Example: Set the number of students

        // Step 1: Generate random scores for students
        int[][] scores = generateScores(numberOfStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Step 3: Display the scorecard
        displayScorecard(scores, results);
    }
}
