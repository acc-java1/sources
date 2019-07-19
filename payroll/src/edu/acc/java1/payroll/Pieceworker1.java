package edu.acc.java1.payroll;

public class Pieceworker1 {
	public String name;
	public double hours;
	public double wage;
	public double pieceRate;
	public int pieces;
	
	public Pieceworker1(String name, double wage, double hours,
			double pieceRate, int pieces) {
		this.name = name;
		this.wage = wage;
		this.hours = hours;
		this.pieceRate = pieceRate;
		this.pieces = pieces;
	}
	public double calculatePay() {
		double pay = wage * hours;
		if (hours > 40) pay += .5 * wage * (hours - 40);
		pay += pieceRate * pieces;
		return pay;		
	}
}