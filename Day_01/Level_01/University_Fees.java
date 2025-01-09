//The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

// Creating Class with name Prog_6 indicating the purpose is to display result.
class Fees {
	public static void main(String[] args) {

		// Create a int variable fee and assign value 125000
		int fee = 125000;

		// Create a int variable discountPercent and assign value 10
		int discountPercent = 10;

		// Create a double variable discount and Compute discount
		double discount = (discountPercent / 100.0) * fee;

		// Create a double variable discounted_fee and Compute discounted_fee
		double discounted_fee = fee - discount;

		// Display the result
		System.out.println(
				"The discount amount is INR " + discount + " and final discounted fee is INR " + discounted_fee);
	}
}
