// using for loop , printf formatting , using Math.pow 


public class Interest {
	public static void main(String[] args) {
		double principal = 1000.0;
		double interest = 0.05;

		for (int year = 1; year <= 10; year++) {
			double amount = principal * Math.pow(1.0 + interest, year);
			System.out.printf("Year: %d  Amount: %.2f \n", year, amount);
		}
	}
}
