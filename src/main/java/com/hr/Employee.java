package com.hr;

public class Employee {
    private String name;
    private double salary;
    private int age;
    private String department;
    private String position;

    // 建構子
    public Employee(String name, double salary , int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = "Staff";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //this.salary = salary;
        if (salary < 0){
            System.out.println("薪水不能為負數！");
        }
        else  {
            this.salary = salary;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public double calculateAnnualSalary(){
        return salary * 12;
    }

    public void promote(String newPosition , double raise){
        this.position = newPosition;
        this.salary += raise;
    }

    public String toString(){
        return "Name: "+name+" ("+position+") \nSalary: "+salary+"\nAge: "+age;
    }
}
