package edu.acc.java1.payroll;

public class Hourly1 {
	public String name;
	public double hours;
	public double wage;
	
	public Hourly1(String name, double wage, double hours) {
		this.name = name;
		this.wage = wage;
		this.hours = hours;
	}
	
	public double getPay() {
		double pay = wage * hours;
		if (hours > 40) pay += .5 * wage * (hours - 40);
		return pay;
	}
}