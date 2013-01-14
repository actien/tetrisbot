package tetrisbot;

import java.awt.image.BufferedImage;

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
		SuperBot superBot = new SuperBot();
		BufferedImage testImage = superBot.captureFullScreen();
		superBot.saveImage(testImage, "/home/nd/Desktop/Coding/tetrisImages/test");
		superBot.saveImage(testImage, "jpg", "/home/nd/Desktop/Coding/tetrisImages/testjpg");
	}
}
