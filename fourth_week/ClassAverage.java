import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int counter = 0;

		System.out.println("Enter the first grade (-1 to quit)");
		int grade = scanner.nextInt();

		while (grade != -1) {
			total = total + grade;
			counter++;

			System.out.println("Enter the next grade (-1 to quit)");
			grade = scanner.nextInt();

		}
		scanner.close();

		if (counter != 0) {
			System.out.println("Number of the students: " + counter);
			System.out.println("Class average is:" + total / counter);

		} else {
			System.out.println("No grades entered");
		}
	}
}
