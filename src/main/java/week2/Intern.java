package week2;

public class Intern extends Employee implements Payable{
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return 0;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Intern " + name + ": $" + amount);
    }
}
