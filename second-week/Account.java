import java.util.Scanner;

public class Account {

    private String name;
    private int age;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public void enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account name"); 
        name = scanner.nextLine();       
        scanner.close();
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() { 
        return balance;
    }

    public void Deposit(double money){
        balance = balance + money;
    }

    public void Withdraw(double money) {
        if (balance - money >= 0) {
            balance = balance - money;
        } else {
            System.out.println("Not enough funds");
        }
    }
    public static void main(String[] args) {
        Account account = new Account();


        account.getName();
        System.out.println(account.name); 
        account.enterName();
        account.getName();
        System.out.println(account.name); 

        account.getBalance();
        System.out.println(account.balance);
        account.setBalance(50.0);
        System.out.println(account.balance);

        account.getAge();
        System.out.println(account.age);
        account.setAge(18);
        System.out.println(account.age);

        account.Deposit(100.0);
        System.out.println(account.balance);
        account.Withdraw(20);
        System.out.println(account.balance);
    }
    
}
