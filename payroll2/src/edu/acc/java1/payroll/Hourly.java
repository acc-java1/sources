package edu.acc.java1.payroll;

public class Hourly extends Employee {
	private double wage;
	private double hours;
	
	public Hourly(String firstName, String lastName, String title,
			int id, double wage, double hours) {
		super(firstName, lastName, title, id);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public double getPay() {
		double pay = wage * hours;
		if (hours > 40) pay += .5 * wage * (hours - 40);
		return pay;
	}
	
	public double getWage() { return wage; }
	public double getHours() { return hours; }

}
