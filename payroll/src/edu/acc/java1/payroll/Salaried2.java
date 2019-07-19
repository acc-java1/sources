package edu.acc.java1.payroll;

public class Salaried2 extends Employee {
	public double salary;
	public Salaried2(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public double getPay() {
		return salary / 52.0;
	}
}
