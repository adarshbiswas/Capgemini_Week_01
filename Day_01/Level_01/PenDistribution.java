//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

//Creating Class with name Prog 5 indicating the purpose is to display result.
class PenDistribution {
	public static void main(String[] args) {

		// Create a int variable pens and assign value 14
		int pens = 14;

		// Create a int variable students and assign value 3
		int students = 3;

		// Create a int variable not_distributed to find the remaining pens
		int not_distributed = pens % 3;

		// Create a int variable pen_perstudent to find the Quantity of pen each student
		// gets
		int pen_perstudent = students / 3;

		// Display the result
		System.out.println("The Pen Per Student is " + pen_perstudent + "and the remaining pen not distributed is "
				+ not_distributed);
	}
}
