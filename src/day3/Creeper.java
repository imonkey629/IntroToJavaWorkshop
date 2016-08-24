package day3;

import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String PW=JOptionPane.showInputDialog("what is your password?");
	String HA=JOptionPane.showInputDialog("Whats your Home adress?");
	String LC=JOptionPane.showInputDialog("whats your locker number");
	JOptionPane.showMessageDialog(null, "I know your Password is "+PW+", your Home adress is "+HA+", and your Locker combination is "+LC );
	}
}
