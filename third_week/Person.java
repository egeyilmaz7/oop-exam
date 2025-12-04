public class Person {
	/*
	 * talked about uml (top compartment(class name), middle compartment(variables),
	 * bottom comartment(methods))
	 * - sign for private + for public
	 * 
	 * if you dont have any constructor the compiler gives you a constructor
	 * 
	 * 
	 * primitive types and reference types:
	 * 
	 * primitive: stored on stack boolean,byte,short,int,long,float
	 * reference: stored on heap(dynamic memory allocations)
	 * 
	 * algortigm = any computing problem can be solved by executing a series of
	 * actions in a specific order
	 * pseduecode - flow diagram
	 * control structures
	 * - if
	 * - if else
	 * - switch (key)
	 * iteration statements
	 * - for
	 * - while
	 * - do while
	 * 
	 * nested : statement inside of a another statement
	 * 
	 */

	public int age;
	public String name;
	public double weight;

	// constructor
	public Person(String name, int age, double weight) { // stored on the heap
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Ege", 18, 75.5555); // p1 is the reference of the Person class, p1 is reference
								// type
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.printf("Name: %s | Age: %d | Weight: %.2f", p1.getName(), p1.getAge(), p1.getWeight());
	}

}
