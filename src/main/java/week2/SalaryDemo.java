package week2;

public class SalaryDemo {
    public static void main(String[] args) {
        Payable [] staff = {
          new Manager("Alice" , 70000 , 15000),
          new Intern("Bob" , 25000)
        };

        for (Payable p : staff) {
            Employee e = (Employee) p;
            double salary = e.calculateSalary();
            p.pay(salary);
            p.printReceipt(e.name , salary);
        }
    }
}
