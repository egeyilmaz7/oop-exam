import java.util.Scanner;

public class Temp{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the temperature in C:");
		int temp = scanner.nextInt();

		if (temp < 10) {
			System.out.println("Its cold");
		} else if (10 <= temp && temp < 25) {
			System.out.println("It is warm");
		} else {
			System.out.println("Its hot!!!");
		}
		scanner.close();
	}
}
