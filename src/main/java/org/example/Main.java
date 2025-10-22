package org.example;

import com.hr.Employee;
import com.hr.Manager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Employee employee = new Employee("梟雄" , 50000);
        employee.showInfo();

        Manager manager = new Manager("八嘎" , 70000 , 1000);
        manager.showInfo();
    }
}