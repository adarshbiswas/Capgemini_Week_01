// Write a new program but take user input for Student Fee and University Discount

// including scanner package
import java.util.Scanner;

public class Student_Fees {
      public static void main(String[] args) {

            // Create an instance of Scanner class to user input
            Scanner input = new Scanner(System.in);

            // Creating int variable to take input of college fee
            int fee = input.nextInt();

            // Creating int variable to take input of discount percent
            int discountPercent = input.nextInt();

            // creating a int variable discountAmount to store the discounted amount
            int discountAmount = (fee * discountPercent) / 100;

            // creating a int variable discountedPrice to store the fee of student after
            // discount
            int discountedPrice = fee - discountAmount;

            // Display the result
            System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR "
                        + discountedPrice);

            input.close();
      }
}