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

public class Payroll4 {
	public static void main(String[] args) {
		final Employee[] staff = {
			new Salaried2("Alice Alpha", 80_000.00),
			new Hourly2("Bob Beta", 28.00, 42.75),
			new Pieceworker2("Gene Gamma", 15.00, 31.5, .18, 808),
			new Intern("Dana Delta", 300)
		};
		
		System.out.println();
		double companyGross = 0.0;
		for (Employee e : staff) {
			companyGross += e.getPay();
			System.out.printf("Pay to the order of %s the amount $%.2f\n", e.name, e.getPay() * .77);
		}
		System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
	}
}
/*
	Because our new employee classes descend from a common ancestor whose features
	(name and payment method) are inherited, our loop has very little work to do. We
	have a very DRY application with few flaws. Our last flaws can be cleaned up by
	making the Employee class abstract.
*/