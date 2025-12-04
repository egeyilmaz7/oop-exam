public class Main {

	/*
	 * while, for , do while , switch , break , continue
	 * teacher might ask some questions about UML Diagram (my guess)
	 */

	public static void main(String[] args) {

		int counter = 1; // initializing before the while and update it in the while block
		System.out.println("while loop:");

		while (counter <= 10) {
			System.out.printf("%d ", counter);
			counter++;
		}

		System.out.println();

		System.out.println("for loop:");

		for (int i = 10; i >= 1; i--) { // initalization and updating in declaring
			System.out.printf("%d ", i);
		}

		System.out.println();
		// total number example

		int total = 0;
		for (int number = 2; number <= 20; number += 2) {
			total += number;
		}
		System.out.println("total number is: " + total);

		// do while
		System.out.println("do while: ");

		int c = 1;
		do {
			System.out.printf("%d ", c);
			c++;
		} while (c <= 10);
	}
}
