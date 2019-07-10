package edu.acc.java1;

import javax.swing.*;

/**
 * A Java program to print a greeting to the user. The user
 * will be prompted for their name in the console and a
 * customized greeting will display in both the console
 * and in a pop-up dialog.
 * <p>
 * Compile from <tt>src</tt> with: <tt>javac -d ../bin edu/acc/java1/Hello.java</tt>
 * <p>
 * Run from <tt>bin</tt> with: <tt>java edu.acc.java1.Hello</tt>
 */
public class Hello {

    public static void main(String[] args) {
        final String PROMPT = "Enter your name: ";
        final String NAME = System.console().readLine(PROMPT);
        final String GREETING = "Hello";
        final String FORMAT = "%s, %s!\n";
        final String OUTPUT = String.format(FORMAT, GREETING, NAME);
        System.out.printf(OUTPUT);
        JOptionPane.showMessageDialog(null, OUTPUT);
    }
}
