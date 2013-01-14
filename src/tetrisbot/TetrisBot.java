package tetrisbot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

/*
 * General approach:
 * - First we need to have the application be able to detect positioning on 
 *   the webpage - do this with an image snapshot
 *   Make a robot super class that encapsulates a ROBOT, and extends on the robot's
 *   functionality with other capabilities, such as grabbing data.
 *   
 * - Then, construct model based on current snapshot information
 * 		- Use some kind of grid to make this happen
 * 		- Use swing application to express this/error check
 * 
 */

public class TetrisBot
{
	public static void main(String[] args)
	{
		// Tests creation of superbot, and saves the image of the full screen at the address
		//SuperBot superBot = new SuperBot();
		
		
		//TODO: What the heck is this thread stuff/interrupt stuff?
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		//BufferedImage superImage = superBot.captureFullScreen();
		BufferedImage superImage = null;
		BufferedImage subImage = null;
		//superBot.saveImage(superImage, "/home/nd/Desktop/Coding/tetrisImages/superImage");
		//superBot.saveImage(testImage, "/home/nd/Desktop/Coding/tetrisImages/test");
		//superBot.saveImage(testImage, "jpg", "/home/nd/Desktop/Coding/tetrisImages/testjpg");
		
		File input = new File("/home/nd/Desktop/Coding/tetrisImages/playfield");
		try {
			subImage = ImageIO.read(input);
		} catch (IOException e) {
			System.err.println("image reading failed");
			e.printStackTrace();
		}
		
		input = new File("/home/nd/Desktop/Coding/tetrisImages/superImage");
		try {
			superImage = ImageIO.read(input);
		} catch (IOException e) {
			System.err.println("image reading failed");
			e.printStackTrace();
		}
		
		if (subImage !=null){
			if(ImageComparison.findSubImage(subImage, superImage))
			{
				System.out.println("Comparison success. Subimage found!");
			}else{
				System.out.println("Comparison failed. Subimage NOT found!");
			}
		}else{
			System.out.println("subimage was null");
		}
	}
}
