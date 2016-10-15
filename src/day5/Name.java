package day5;

import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String answer=JOptionPane.showInputDialog(null, "whats your name?");
	JOptionPane.showMessageDialog(null, "hello" + answer);
}
}
