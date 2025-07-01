package tw.sam.api;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel{
	//private ArrayList<Point> line;
	//private ArrayList<ArrayList<Point>> lines;
	private ArrayList<Line> lines, recycler;
	private Color defaultColor;
	
	public MyDrawer() {
		lines = new ArrayList<>();
		recycler = new ArrayList<>();
		defaultColor = Color.BLACK;
		
		setBackground(Color.YELLOW);
		
		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);

//		MyMouseAdapter2 adapter = new MyMouseAdapter2(lines, recycler, this);
//		addMouseListener(adapter);
//		addMouseMotionListener(adapter);
	
	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		
		
		
		for (Line line : lines) {
			g2d.setColor(line.getColor());	
			for (int i=1; i<line.numberOfPoint(); i++) {
				Point p1 = line.getPoint(i-1);
				Point p2 = line.getPoint(i);
				g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
			}
			
		}
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			Line line = new Line(defaultColor);
			Point p = new Point(e.getX(), e.getY());
			line.addPoint(p);
			lines.add(line);
			recycler.clear();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Point p = new Point(e.getX(), e.getY());
			lines.getLast().addPoint(p);
			repaint();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size() > 0) {
			recycler.add(lines.removeLast());
			repaint();
		}
	}
	public void redo() {
		if (recycler.size() > 0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public Color getColor() {
		return defaultColor;
	}
	
	public void changeColor(Color newColor) {
		defaultColor = newColor;
	}
	
}