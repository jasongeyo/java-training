package org.example;

import com.hr.Employee;
import com.hr.Manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Employee employee = new Employee("梟雄" , 50000 , 25);
        employee.showInfo();
        employee.promote("Manager" , 5000);
        System.out.println(employee.getName() + " " + employee.getPosition() + " " + employee.calculateAnnualSalary());

        Manager manager = new Manager("八嘎" , 70000 , 1000);
        manager.showInfo();

        /*
        Employee[] employees = { employee, manager };

        //  一般寫法
        for (Employee e : employees) {
            System.out.println(e.getName() + " 年薪: " + e.calculateAnnualSalary());
        }
        // Lambda + Stream 寫法
        Arrays.stream(employees).forEach(e ->
                System.out.println(e.getName() + " 年薪: " + e.calculateAnnualSalary())
        );
        */

        //  使用 ArrayList 取代陣列
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(manager);
        //  Lambda + Stream 印出薪資
        employees.stream().forEach(e -> System.out.println(e.getName() + " " + e.getPosition() + " " + e.calculateAnnualSalary()));

        //  Method Reference 簡化寫法
        employees.stream().map(Employee::toString).forEach(System.out::println);

        List<String> names = employees.stream()
                .filter(e -> e.calculateAnnualSalary() > 600000)
                .map(Employee::getName)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}