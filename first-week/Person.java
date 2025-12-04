import java.util.Scanner;

public class Person {

    public int age = 10;

    public void sayHello() {
        System.out.println("Hello have a nice day!");
    }

    public void sayAge() {
        System.out.println("My age is: " + age);
    }

    public void updateAge() {
        age = 15;
    }

    public void incrementAge() {
        age++;
    }

    public void enterAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.close();
    }

    public static void main(String[] args) {
        Person p1 = new Person();

        p1.sayHello();
        p1.sayAge();
        p1.updateAge();
        p1.sayAge();
        p1.incrementAge();
        p1.sayAge();
        p1.enterAge();
        p1.sayAge();

    }
}
