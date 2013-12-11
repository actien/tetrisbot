package tetrisbot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * This superbot encapsulates an internal robot class, and extends
 * on the existing functions to include things such as image processing.
 * 
 * This robot with extra features will act as the ACTOR component.
 * @author Andy Tien
 *
 */
public class SuperBot
{
	private Robot superBot;
	
	public SuperBot()
	{
		try{
			superBot = new Robot();
		} catch(AWTException e){
			System.err.println("Error creating internal robot");
			e.printStackTrace();
		}
		
		System.out.println("Robot created!");
	}
	
	/**
	 * Captures the entire screen and returns the buffered image
	 * @return the buffered image
	 */
	public BufferedImage captureFullScreen(){
		Dimension desktopDimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(desktopDimension);
		return superBot.createScreenCapture(screenRectangle);
	}
	
	/**
	 * Writes a given image to the given filepath as a .png file.
	 * @param image
	 * @param filePath
	 */
	public void saveImage(BufferedImage image, String filePath)
	{
		File outputFile = new File(filePath);
		try {
			ImageIO.write(image, "png", outputFile);
		} catch (IOException e) {
			System.err.println("Image writing error!");
			e.printStackTrace();
		}
	}
	
	/**
	 * Writes a given image to the given filepath, using a given format.
	 * @param image
	 * @param format
	 * @param filePath
	 */
	public void saveImage(BufferedImage image, String format, String filePath)
	{
		File outputFile = new File(filePath);
		try {
			ImageIO.write(image, format, outputFile);
		} catch (IOException e) {
			System.err.println("Image writing error!");
			e.printStackTrace();
		}
	}
}
