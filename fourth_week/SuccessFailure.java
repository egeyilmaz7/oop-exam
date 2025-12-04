import java.util.Scanner;

public class SuccessFailure {

	public static void main(String[] args) {
		int passes = 0;
		int failures = 0;
		int counter = 1;
		Scanner scanner = new Scanner(System.in);
		while (counter <= 10) {
			System.out.println("Enter 1 for success, 2 for failure");
			int selection = scanner.nextInt();
			if (selection == 1) {
				passes++;
			} else {
				failures++;
			}
			counter++;
		}
		scanner.close();
		System.out.println("Total passes:" + passes);
		System.out.println("Total failures:" + failures);
	}

}
