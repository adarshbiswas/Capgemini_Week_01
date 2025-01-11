package Day_04.Level_03;

 /*Question 10:Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
 */
   
//import the scanner class
import java.util.Scanner;
//create the class Colinear
public class Collinear {

    // Method to check collinearity using the slope formula
    public static boolean collinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean collinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area of the triangle using the determinant formula
        double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;

        // If area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coordinates of the three points
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check collinearity using slope formula
        boolean collinearBySlope = collinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check collinearity using area formula
        boolean collinearByArea = collinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        if (collinearBySlope) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        if (collinearByArea) {
            System.out.println("The points are collinear using the area of the triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of the triangle formula.");
        }

        sc.close();
    }
}

