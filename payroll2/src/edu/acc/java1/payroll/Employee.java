package edu.acc.java1.payroll;

public abstract class Employee implements java.io.Serializable {
	private String firstName;
	private String lastName;
	private int id;
	
	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public abstract double getPay();
	
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public int getId() { return id; }
	
	@Override
	public String toString() {
		return String.format("%s %s", firstName, lastName);
	}

}