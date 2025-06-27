package tw.work;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Work19 extends JFrame {
	private JButton b1,b2,b3;
	
	public Work19() {
		b1 = new JButton("B1"); 
		b2 = new JButton("B2"); 
		b3 = new JButton("B3"); 
	
		setLayout(new FlowLayout());
		add(b1);add(b2);add(b3);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Work19();

	}

}


//public Work19() {
//	System.out.println("test19()");