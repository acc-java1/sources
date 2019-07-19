package edu.acc.java1.payroll;

public class Pieceworker2 extends Hourly2 {
	public double pieceRate;
	public int pieces;
	public Pieceworker2(String name, double wage, double hours,
			double pieceRate, int pieces) {
		super(name, wage, hours);
		this.pieceRate = pieceRate;
		this.pieces = pieces;
	}
	
	@Override
	public double getPay() {
		double pay = super.getPay();
		pay += pieceRate * pieces;
		return pay;
	}
}