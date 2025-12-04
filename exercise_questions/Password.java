import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the password: ");
		String password = scanner.nextLine();
		if (password.length() < 6) {
			System.out.println("Weak Password");
		}
		if (password.length() >= 6 && password.length() < 10) {
			System.out.println("Mid Password");
		}
		if (password.length() >= 10) {
			System.out.println("Strong Password");
		}
		scanner.close();
	}
}
