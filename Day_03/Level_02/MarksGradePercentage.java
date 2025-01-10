/*
 Q.8) Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
 */

// import java.util.Arrays;
import java.util.Scanner;

public class MarksGradePercentage {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("\nEnter number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        float[] physicsMarks = new float[numberOfStudents];
        float[] chemistryMarks = new float[numberOfStudents];
        float[] mathsMarks = new float[numberOfStudents];
        float[] percentages = new float[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the marks for student " + (i + 1) + ": ");

            // Input marks for Physics
            System.out.print("Enter Physics marks: ");
            physicsMarks[i] = input.nextFloat();
            while (physicsMarks[i] < 0) {
                System.err.println("Invalid physics mark, Enter positive mark");
                physicsMarks[i] = input.nextFloat();
                System.exit(0);
            }

            // Input marks for Chemistry
            System.out.print("Enter Chemistry marks: ");
            chemistryMarks[i] = input.nextFloat();
            while (chemistryMarks[i] < 0) {
                System.err.println("Invalid chemistry mark, Enter positive mark");
                chemistryMarks[i] = input.nextFloat();
                System.exit(0);
            }

            // Input marks for Maths
            System.out.print("Enter Maths marks: ");
            mathsMarks[i] = input.nextFloat();
            while (mathsMarks[i] < 0) {
                System.err.println("Invalid maths mark, Enter positive mark");
                mathsMarks[i] = input.nextFloat();
                System.exit(0);
            }

            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0f;

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
            System.out.println("Student " + (i + 1) + ": Physics=" + physicsMarks[i] + ", Chemistry="
                    + chemistryMarks[i] + ", Maths=" + mathsMarks[i] + ", Percentage="
                    + String.format("%.2f", percentages[i]) + ", Grade=" + grades[i]);
        }

        // Close the Scanner Object
        input.close();
    }

}
