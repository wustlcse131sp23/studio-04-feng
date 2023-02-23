package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(155,0,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		double x[] = {0.35, 0.65, 0.20, 0.80};
		double y[] = {0.25, 0.25, 0.70, 0.70};
		StdDraw.setPenColor(255, 87, 41);
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.7, 0.02, 0.05);
	}
}