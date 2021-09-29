package poligon;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class poligon {

	public static void main(String[] args) {
		
		JFrame okno = new JFrame("Poligon");
		PoligonPanel p = new PoligonPanel();
		
	
		okno.setBounds(50, 50, 1920, 1080);
		okno.add(p);
		okno.setVisible(true);

		
	}

}