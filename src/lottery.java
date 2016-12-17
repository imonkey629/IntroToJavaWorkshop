import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		//Random generator=new Random();
			//for(int e=1; e<=5; e++){
			//int r = generator.nextInt(100);
			//JOptionPane.showMessageDialog(null, r);	
			//}
		Random gen= new Random();
		int g= gen.nextInt(100);
		JOptionPane.showMessageDialog(null,g+" "+g+""+" "+g+" "+g+" "+ g);
		
	}
}