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

public class Payroll2 {
	public static void main(String[] args) {
		final String[] names = {"Alice Alpha", "Bob Beta", "Gene Gamma"};
		final double[] wages = {80_000.0/52/40, 28.00, 15.00};
		final double[] hours = {40.0, 42.75, 31.5};
		final double[] rate  = {0, 0, .18};
		final int[] pieces   = {0, 0, 808};
		
		final double tax = .23;
		double companyGross = 0.0;
		System.out.println();
		
		for (int i = 0; i < names.length; i++) {
			double pay = wages[i] * hours[i];
			if (hours[i] > 40)
				pay += .5 * wages[i] * (hours[i] - 40);
			pay += pieces[i] * rate[i];
			companyGross += pay;
			pay *= (1.00 - tax);
			System.out.printf("Pay to the order of %s the amount $%.2f\n", names[i], pay);
		}
		System.out.printf("\nCompany Gross: $%.2f\n", companyGross);
	}
}
/*
	This solution uses arrays to overcome the DRY violations of the previous solution.
	However, we're forced to massage data and create placeholders in order to make
	the arrays "line up" so that each index, across all the arrays, forms one employee
	record.
	
	The loop that ensures DRYness has a lot of wasted processing - calculating piecework
	pay for two employees that don't work the assembly line and simulating salary with
	hourly calculations. Blech.
*/
