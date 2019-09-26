package edu.acc.java1.payroll;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(String firstName, String lastName, int id, double salary) {
		super(firstName, lastName, id);
		this.salary = salary;
	}

	@Override
	public double getPay() {
		return salary / 52.0;
	}
	
	public double getSalary() { return salary; }
}
