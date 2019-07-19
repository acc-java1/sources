package edu.acc.java1.payroll;

public class Intern extends Employee {
	public double stipend;
	public Intern(String name, double stipend) {
		super(name);
		this.stipend = stipend;
	}
	
	@Override
	public double getPay() {
		return stipend / 4.0;
	}
}