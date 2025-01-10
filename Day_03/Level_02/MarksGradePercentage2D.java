/* Q.9) Rewrite the same MarksGradePercentage program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade */

// import java.util.Arrays; 
import java.util.Scanner;

public class MarksGradePercentage2D {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("\nEnter number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a 2D array to store marks of students in physics, chemistry, and maths
        float[][] marks = new float[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        float[] percentages = new float[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Take input for marks of students
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the marks for student " + (i + 1) + ": ");

            // Input marks for Physics
            System.out.print("Enter Physics marks: ");
            marks[i][0] = input.nextFloat();
            while (marks[i][0] < 0) {
                System.err.println("Invalid physics mark, Enter positive mark");
                marks[i][0] = input.nextFloat();
                System.exit(0);
            }

            // Input marks for Chemistry
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = input.nextFloat();
            while (marks[i][1] < 0) {
                System.err.println("Invalid chemistry mark, Enter positive mark");
                marks[i][1] = input.nextFloat();
                System.exit(0);
            }

            // Input marks for Maths
            System.out.print("Enter Maths marks: ");
            marks[i][2] = input.nextFloat();
            while (marks[i][2] < 0) {
                System.err.println("Invalid maths mark, Enter positive mark");
                marks[i][2] = input.nextFloat();
                System.exit(0);
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0f;

            // Calculate grades
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display the Marks of (Physics, Chemistry, Maths), Percentages, and Grades of
        // each student
        System.out.println("\nResults:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + ", Chemistry="
                    + marks[i][1] + ", Maths=" + marks[i][2] + ", Percentage="
                    + String.format("%.2f", percentages[i]) + "%, Grade=" + grades[i]);
        }

        // Close the Scanner Object
        input.close();
    }

}
