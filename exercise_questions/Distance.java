import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter km (0 to quit): ");
		int km = scanner.nextInt();
		int total = 0;
		while (km != 0) {
			total = total + km;

			System.out.println("Enter km (0 to quit): ");
			km = scanner.nextInt();

		}
		System.out.println("Total km is: " + total);
		scanner.close();
	}

}
