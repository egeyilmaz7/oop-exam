public class Employee {

	public String name;
	public double baseSalary;
	public double bonusRate;

	public Employee(String name, double baseSalary, double bonusRate) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonusRate = bonusRate;
	}

	public double calculateFinalSalary() {
		double finalSalary = baseSalary + baseSalary * bonusRate - (baseSalary * bonusRate / 2);
		return finalSalary;
	}

	public void printInfo(Employee e1) {
		System.out.printf("Name: %s | Salary: %.2f", e1.name, calculateFinalSalary());
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Ege", 70.000, 0.05);
		e1.printInfo(e1);
	}

}
