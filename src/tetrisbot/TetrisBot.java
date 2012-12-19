package tetrisbot;

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
		System.out.println("Creating a superbot.. should print something in constructor:");
		SuperBot superBot = new SuperBot();
		
	}
}
