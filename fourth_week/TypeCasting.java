public class TypeCasting {
	public static void main(String[] args) {
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myInt); // prints 9
		System.out.println(myDouble); // prints 9.0

		double doubleNum = 9.78d;
		int intNum = (int) doubleNum; // Manual casting: double to int
		System.out.println(doubleNum); // prints 9.78
		System.out.println(intNum);

		// ex:
		int num1 = 55;
		int num2 = 4;
		System.out.println(num1 / num2); // prints integer
		System.out.println((double) num1 / num2); // prints double
	}
}
