package week2;

public class Manager extends Employee implements Payable{
    double bonus;
    public Manager(String name , double baseSalary, double bonus) {
        super(name , baseSalary);
        this.bonus = bonus;

    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Manager " + name + ": $" + amount);
    }
}
