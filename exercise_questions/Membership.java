public class Membership {

	public static void membership(int points) {
								if (points >= 1000) {
									System.out.println("Current rank: Diamond");
								} else if (points >= 800) {
									System.out.println("Current rank: Platinium");
								}else if (points >= 600) {
									System.out.println("Current rank: Gold");
								} else if (points >= 400) {
									System.out.println("Current rank: Silver");
								}else if (points >= 0){
									System.out.println("Current rank: Bronze");
								}

				}

	public static void main(String[] args) {

								membership(700);
	}
}
