/*
	The employees of Widgets, Inc. are:
		Alice Alpha, CEO, salaried at $80,000 per year
		Bob Beta, Middle Manager, earns $28 per hour and overtime. Bob worked
			42.75 hours this week.
		Gene Gamma, Widgetmaker, earns $15 per hour and 18 cents per widget
		completed. This week, Gene worked 31.5 hours and assembled 808 widgets.

	Write a packaged Java program that will accomplish the following goals:
	1) Display this week's "paycheck" for each the people above in the form:
			Pay to the order of John Doe the amount $####.##
	2) Display the total company gross payroll for the week
	
	Widgets, Inc. withholds 23% of each paycheck for taxes, etc.
*/
package edu.acc.java1.payroll;

public class Payroll3 {
	public static void main(String[] args) {
		Salaried1    a = new Salaried1("Alice Alpha", 80_000.00);
		Hourly1      b = new Hourly1("Bob Beta", 28.00, 42.75);
		Pieceworker1 g = new Pieceworker1("Gene Gamma", 15.00, 31.5, .18, 808);

		Object[] staff = {a, b, g};
		System.out.println();
		
		double companyGross = 0.0;
		for (int i = 0; i < staff.length; i++) {
			double pay = 0.0;
			String name = null;
			if (staff[i] instanceof Salaried1) {
				Salaried1 s = (Salaried1)staff[i];
				pay = s.weeksPay();
				name = s.name;
			}
			else if (staff[i] instanceof Hourly1) {
				Hourly1 h = (Hourly1)staff[i];
				pay = h.getPay();
				name = h.name;
			}
			else if (staff[i] instanceof Pieceworker1) {
				Pieceworker1 p = (Pieceworker1)staff[i];
				pay = p.calculatePay();
				name = p.name;
			}
			companyGross += pay;
			pay *= .77;
			System.out.printf("Pay to the order of %s the amount $%.2f\n", name, pay);
		}
		System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
	}
}
/*
	This version introduces TYPING to encapsulate the idea of an employee.
	Each employee has a name and a method to acquire payment data. Yay!
	
	However, because there are no relationships among the new types, we can only
	assemble them into an Object array which provides no polymorphism.
	We have to check the type of each employee so that we can safely cast the
	reference to a type that has a name and a payment method. This creates a lot
	of mess.
	
	The payment method has a different name in every class! There should be a way
	to force developers to share a name for a common feature like this.
*/