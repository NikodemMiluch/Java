package samochod;

import java.awt.*;
import javax.swing.*;

public class panelsamochod extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		
		g.setColor(new Color(41,41,41));
		g.fillOval(233,290,100,100);
		
		g.setColor(new Color(41,41,41));
		g.fillOval(466,290,100,100);
		
		
		g.setColor(new Color(89,169,255));
		g.fillOval(270,110,85,110);
		
		g.setColor(new Color(219,89,255));
		g.fillRect(200,200,400,150);
		g.fillRect(310,110,200,90);

		

	
		
		
		
		/*Polygon trojkat = new Polygon(trojX,trojY,trojX.length);
		g.fillPolygon(trojkat);*/
	}	
}  