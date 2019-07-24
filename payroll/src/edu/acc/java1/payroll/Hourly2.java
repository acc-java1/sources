package edu.acc.java1.payroll;

public class Hourly2 extends Employee {
	public double wage;
	public double hours;
	public Hourly2(String name, double wage, double hours) {
		super(name);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPay() {
		double pay = wage * hours;
		if (hours > 40) pay += .5 * wage * (hours - 40);
		return pay;
	}

}
