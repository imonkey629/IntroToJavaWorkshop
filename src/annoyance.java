import javax.swing.JOptionPane;

public class annoyance {
	public static void main(String[] args) {
		//for (int i = 1; i <= 4; i = i + 1) {
			//JOptionPane.showMessageDialog(null, "get up early");
		//}
		String num = JOptionPane.showInputDialog(null,"how annoying am I?");
		int i= Integer.parseInt(num);
		for (int o = 1;o <= i; o= o + 1) {
			JOptionPane.showMessageDialog(null, "get up early");
		}

	}
}
