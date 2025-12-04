import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("sum: " + sum);

        if (num1 == num2) {
            System.out.println("numbers are equal");
        }

        if (num1 > num2) {
            System.out.println(num1 + " is greater then " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " is smaller then " + num2);
        }

        if (num1 != num2) {
            System.out.println("numbers are NOT equal");
        }

        scanner.close();
    }
}
