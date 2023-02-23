package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double[] parameters = new double[6];
		for (int i = 0; i<6; i++) {
			parameters[i] = in.nextDouble();
		}
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);

		if (shapeType.equals("rectangle")) {
			if (isFilled == true) {
				StdDraw.filledRectangle(parameters[0], parameters[1], parameters[2], parameters[3]);
			}
			else {
				StdDraw.rectangle(parameters[0], parameters[1], parameters[2], parameters[3]);
			}
		}
	}
}
