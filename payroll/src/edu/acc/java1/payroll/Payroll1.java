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

public class Payroll1 {
	public static void main(String[] args) {
		final String format = "Pay to the order of %s the amount $%.2f\n";
		final double tax = .23;
		
		double companyGross = 0.0;
		System.out.println();
		
		String name = "Alice Alpha";
		double weeksPay  = 80_000.00 / 52;
		companyGross += weeksPay;
		System.out.printf(format, name, weeksPay * (1.00 - tax));
		
		name = "Bob Beta";
		weeksPay = 42.75 * 28 + ((42.75 - 40) * .5 * 28);
		companyGross += weeksPay;
		System.out.printf(format, name, weeksPay * (1.00 - tax));
		
		name = "Gene Gamma";
		weeksPay = (31.5 * 15) + (.18 * 808);
		companyGross += weeksPay;
		System.out.printf(format, name, weeksPay * (1.00 - tax));
		
		System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
	}
}
/*
	This solution doesn't scale at all. There are four lines of code
	to calculate, accrue, and print employee pay. What if we hire a
	hundred new people?
	
	The calculation, accrual, and printing steps repeat for every employee.
	This is a gross violation of the DRY principle.
*/