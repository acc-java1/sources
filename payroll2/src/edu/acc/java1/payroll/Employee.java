package edu.acc.java1.payroll;

public abstract class Employee implements java.io.Serializable {
	private String firstName;
	private String lastName;
	private String title;
	private int id;
	
	public Employee(String firstName, String lastName, String title, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.id = id;
	}
	
	public abstract double getPay();
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getTitle() { return title; }
	public int getId() { return id; }
	
	@Override
	public String toString() {
		return String.format("%s %s, ", firstName, lastName, title);
	}

}