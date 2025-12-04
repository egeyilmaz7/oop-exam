public class Student {
	/*
	 * 
	 * if, if else, nested if else statements
	 * 
	 * while loop
	 * sentinel controlled while loop
	 * 
	 * auto type casting and manuel type casting
	 * postincrement preincrement difference *
	 */

	private String name;
	private double average;

	public Student(String name, double average) {

		this.name = name;

		if (average >= 0) {
			if (average <= 100) {
				this.average = average;
			} else {
				System.out.println("The average grade out of range (0-100)");
			}
		}

	}

	public String getName() {
		return name;
	}

	public double getAverage() {
		return average;
	}

	public String getLetterGrade() {
		String letterGrade;
		if (average >= 90) {
			letterGrade = "A";
		} else if (average >= 80) {
			letterGrade = "B";
		} else if (average >= 70) {
			letterGrade = "C";
		} else if (average >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		return letterGrade;
	}

	public static void main(String[] args) {

		Student student = new Student("Ege", 72);
		System.out.println("Name: " + student.getName());
		System.out.println("Average: " + student.getAverage());
		System.out.println("Grade: " + student.getLetterGrade());
	}

}
