package edu.acc.java1.text;

public class TextSquisher implements TextMangler {

	@Override
	public String mangle(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isWhitespace(input.charAt(i)))
				sb.append(input.charAt(i));
		}
		return sb.toString();
	}
	
}