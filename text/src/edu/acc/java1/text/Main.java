package edu.acc.java1.text;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		final String input = "\"I am the Lorax who speaks for the trees, " +
			"which you seem to be chopping as fast as you please!\"";
		TextMangler[]  manglers = {
			new TextSquisher(),
			new TextExpander(),
			new TextReverser()
		};
		StringBuilder output = new StringBuilder();
		for (TextMangler m : manglers)
			output.append(m.mangle(input)).append("\n\n");
		JOptionPane.showMessageDialog(null, output.toString());
	}
}