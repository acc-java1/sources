package edu.acc.java1.payroll;

public class Salaried1{
	public String name;
	public double salary;
	public Salaried1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public double weeksPay() {
		return salary / 52.0;
	}
}