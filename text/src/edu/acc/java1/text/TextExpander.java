package edu.acc.java1.text;

public class TextExpander implements TextMangler {

	@Override
	public String mangle(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++)
			sb.append(input.charAt(i)).append(" ");
		return sb.toString().trim();
	}
	
}