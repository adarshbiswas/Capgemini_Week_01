package Day_04.Level_03;

/*Question 9 :Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()
 */
//importing the scanner class
import java.util.Scanner;

//create the EuclideanDistance class
public class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double euclideanDistance(double x1, double x2, double y1, double y2) {
        // Calculate the distance using the formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope and y-intercept of the line passing through two points
    public static double[] equation(double x1, double x2, double y1, double y2) {
        // Array to store the slope and intercept
        double[] slopeAndIntercept = new double[2];

        // Calculate the slope (m = (y2 - y1) / (x2 - x1))
        slopeAndIntercept[0] = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept (b = y1 - m * x1)
        slopeAndIntercept[1] = y1 - (slopeAndIntercept[0] * x1);

        return slopeAndIntercept;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate the Euclidean distance
        double distance = euclideanDistance(x1, x2, y1, y2);

        // Calculate the slope and intercept of the line
        double[] slopeAndIntercept = equation(x1, x2, y1, y2);

        // Display the results
        System.out.println("The Euclidean distance is: " + distance);
        System.out.println("The equation of the line is: y = " + slopeAndIntercept[0] + "x + " + slopeAndIntercept[1]);

        sc.close();
    }
}
