package com.hr;

import java.sql.SQLOutput;

public class Manager extends Employee{
	private double bonus;
	public Manager(String name , double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
	}

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary(){
        return getSalary() + bonus;
    }

    @Override
    public void showInfo(){
        System.out.println("主管姓名: " + getName());
        System.out.println("底薪: " + getSalary());
        System.out.println("獎金" + bonus);
        System.out.println("總金額"+ getTotalSalary());
    }
}
