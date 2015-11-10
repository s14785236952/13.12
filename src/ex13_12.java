// U10116024	���t�w
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex13_12 extends JFrame {
	// no-args constructor
	public ex13_12() {
		setLayout(new BorderLayout());
		add(new DrawSine(), BorderLayout.CENTER);
	}

	// draw the sin and the cos
	class DrawSine extends JPanel {
		// get the Math.sin and return
		double gSin(double x) {
			return Math.sin(x);
		}

		// get the Math.cos and return
		double gCos(double y) {
			return Math.cos(y);
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			// draw the x-axis
			g.drawLine(10, 100, 380, 100);
			// draw the y-axis
			g.drawLine(200, 30, 200, 190);
			// draw the x-axis and y-axis' arrow
			g.drawLine(380, 100, 370, 90);
			g.drawLine(380, 100, 370, 110);
			g.drawLine(200, 30, 190, 40);
			g.drawLine(200, 30, 210, 40);
			// draw the string x and y to the frame
			g.drawString("X", 360, 80);
			g.drawString("Y", 220, 40);
			// create the polygon object
			Polygon p1 = new Polygon();
			Polygon p2 = new Polygon();
			// draw the sin's Graph
			for (int x = -170; x <= 170; x++) {
				p1.addPoint(x + 200, 100 - (int) (50 * gSin((x / 100.0) * 2 * Math.PI)));

			}
			// draw the cos's Graph
			for (int x = -170; x <= 170; x++) {
				p2.addPoint(x + 200, 100 - (int) (50 * gCos((x / 100.0) * 2 * Math.PI)));

			}
			// set the sin's Graph
			g.setColor(Color.red);
			g.drawPolyline(p1.xpoints, p1.ypoints, p1.npoints);
			g.drawString("-2\u03c0", 95, 115);
			g.drawString("2\u03c0", 305, 115);
			g.drawString("0", 200, 115);
			// set the cos's Graph
			g.setColor(Color.blue);
			g.drawPolyline(p2.xpoints, p2.ypoints, p2.npoints);

		}
	}

	public static void main(String[] args) {
		ex13_12 frame = new ex13_12();
		frame.setSize(400, 300);
		frame.setTitle("Exercise13_12");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}