package edu.acc.java1.pets;

public class Main {

	public static void main(String[] args) {
		Dog a = new Dog();
		Dog b = new Dog();

		a.breed = "Pomeranian";
		a.name = "Fifi";

		b.name = "Bowser";
		b.breed = "Boston Terrier";

		a.bark();
		b.bark();
	}

}
