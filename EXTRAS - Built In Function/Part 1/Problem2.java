
// Java program for date arithmetic
import java.time.LocalDate;

public class Problem2 {
    public static void main(String[] args) {
        // Define the initial date
        LocalDate date = LocalDate.of(2023, 1, 1); // Example date

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        // Display the result
        System.out.println("Modified Date: " + modifiedDate);
    }
}
