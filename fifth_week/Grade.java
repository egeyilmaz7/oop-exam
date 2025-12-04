import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter letter grades: ");

		while (scanner.hasNext()) {

			int grade = scanner.nextInt();
			total += grade;
			gradeCounter++;

			switch (grade / 10) {
				case 9:
				case 10:
					aCount++;
					break;
				case 7:
				case 8:
					bCount++;
					break;
				case 5:
				case 6:
					cCount++;
					break;
				case 3:
				case 4:
					dCount++;
					break;
				default:
					fCount++;
					break;

			}
		}

		scanner.close();
		System.out.println();

		System.out.println("Class Avarge: " + total / gradeCounter);
		System.out.println("A: " + aCount);
		System.out.println("B: " + bCount);
		System.out.println("C: " + cCount);
		System.out.println("D: " + dCount);
		System.out.println("F: " + fCount);

	}
}
