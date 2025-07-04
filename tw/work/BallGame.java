package tw.work;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import tw.sam.api.GamePanel2;

public class BallGame extends JFrame{
	private GamePanel2 gamePanel;
	
	public BallGame() {
		setLayout(new BorderLayout());
		
		gamePanel = new GamePanel2();
		add(gamePanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new BallGame();
	}

}