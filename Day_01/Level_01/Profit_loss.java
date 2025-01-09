//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 

// Creating Class with name Prog_4 indicating the purpose is to display result.
class Profit_loss {
	public static void main(String[] args) {

		// Create a int variable cost_price and assign value 129
		int cost_price = 129;

		// Create a int variable selling_price and assign value 191
		int selling_price = 191;

		// Create a double variable profit to find the profit
		double profit = selling_price - cost_price;

		// Create a int variable profit_per to find the profit percentage
		double profit_per = (profit / cost_price) * 100;

		// Display the result
		System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profit_per);

	}
}
