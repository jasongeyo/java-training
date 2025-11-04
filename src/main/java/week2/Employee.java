package week2;

public abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name,double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //  每種員工薪資算法不同 → 抽象方法
    abstract double calculateSalary();
}
