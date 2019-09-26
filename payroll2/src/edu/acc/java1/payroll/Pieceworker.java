package edu.acc.java1.payroll;

public class Pieceworker extends Hourly {
	private double pieceRate;
	private int pieces;
	
	public Pieceworker(String firstName, String lastName, int id,
			double wage, double hours, double pieceRate,
			int pieces) {
		super(firstName, lastName, id, wage, hours);
		this.pieceRate = pieceRate;
		this.pieces = pieces;
	}
	
	@Override
	public double getPay() {
		double pay = super.getPay();
		pay += pieceRate * pieces;
		return pay;
	}
	
	public double getPieceRate() { return pieceRate; }
	public int getPieces() { return pieces; }
}