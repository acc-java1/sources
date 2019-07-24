package edu.acc.java1.text;

public class TextReverser implements TextMangler {
	
	@Override
	public String mangle(String input) {
		StringBuilder sb = new StringBuilder(input);
		return sb.reverse().toString();
	}

}