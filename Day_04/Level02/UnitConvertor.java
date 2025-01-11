//Q-5 Write a program to convert kilometers into miles
//Create a class name UnitConvertor

public class UnitConvertor {

    // Create a method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Create a method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Create a method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Create a method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Create a method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        // Dsplay the results

        // Convert yards to feet
        double yards = 5;
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        // Convert feet to yards
        double feet = 9;
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        // Convert meters to inches
        double meters = 2.5;
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        // Convert inches to meters
        double inches = 100;
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        // Convert inches to centimeters
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + "c");

    }
}
