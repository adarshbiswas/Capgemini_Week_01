// Create TravelComputation Class to compute the Distance and Travel Time
import java.util.Scanner;
class TravelComputation {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        // Create a variable to take user input for name
        String name = sc.nextLine();

        // Create variables to take user input for fromCity, viaCity and toCity to indicate the city
        // from city, via city and to city the person is travelling
        String fromCity = sc.nextLine(), viaCity = sc.nextLine() , toCity = sc.nextLine();

        // Create a variable to take user input for distanceFromToVia to indicate the distance 
		// between the fromCity to viaCity
        double distanceFromToVia = sc.nextDouble();

		// Create a variable to take user input for hoursFromToVia taken
		int hoursFromToVia = sc.nextInt();
		
		// Create a variable to take user input for minutesFromToVia taken
		int minutesFromToVia = sc.nextInt();
		
        // Create a variable timeFromToVia to indicate the time taken to
        // travel from fromCity to viaCity in minutes
        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;
		
        // Create a variable distanceViaToFinalCity to indicate the distance
        // between the viaCity to toCity
        double distanceViaToFinalCity = sc.nextDouble();

		// Create a variable to take user input for hoursViaToFinalCity taken
		int hoursViaToFinalCity = sc.nextInt();
		
		// Create a variable to take user input for minutesViaToFinalCity taken
		int minutesViaToFinalCity = sc.nextInt();
		
        // Create a variable timeViaToFinalCity to indicate the time taken to
        // travel from viaCity to toCity in minutes
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        // Create a variable totalDistance to indicate the total distance
        // between the fromCity to toCity
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        // Create a variable totalTime to indicate the total time taken to
        // travel from fromCity to toCity in minutes
        int totalTime = timeFromToVia + timeViaToFinalCity;
		
		// Print the output of total distance an user travels fromCity to toCity and the total time taken for it
		System.out.print("The total distance an user travels fromCity to toCity is " + totalDistance + " and the total time taken for it is " + totalTime + " minutes.");

    }
}