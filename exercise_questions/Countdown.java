public class Countdown {
	public static void main(String[] args) {
		int num = 10;
		while (num != -1) {
			if (num == 0) {
				System.out.println("LiftOFF!!");
			} else {
				System.out.println(num);
			}
			num--;
		}
	}
}
