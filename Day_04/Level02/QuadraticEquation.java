
//Q-11 Write a program Quadratic to find the roots of the equation ax2+ bx + c
//Create a class name QuadraticEquation
import java.util.Scanner;

public class QuadraticEquation {

    // Create a method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate the discriminant value by using Math
        double delta = Math.pow(b, 2) + (4 * a * c);

        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            return new double[] {};
        }
    }

    public static void main(String[] args) {

        // Create a Scanner class to take input from user
        Scanner input = new Scanner(System.in);

        // Create a variable to take input from user
        System.out.println("Enter the coefficient a:");
        double a = input.nextDouble();

        // Create a variable to take input from user
        System.out.println("Enter the coefficient b:");
        double b = input.nextDouble();

        // Create a variable to take input from user
        System.out.println("Enter the constant c:");
        double c = input.nextDouble();

        // Check where a is not quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {

            double[] roots = findRoots(a, b, c);

            // Display the results
            if (roots.length == 2) {
                System.out.printf("The roots of the equation are:", roots[0], roots[1]);
            } else if (roots.length == 1) {
                System.out.printf("The equation has one root:", roots[0]);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }

        // Close the Scanner
        input.close();
    }
}
