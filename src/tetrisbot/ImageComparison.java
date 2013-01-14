package tetrisbot;

import java.awt.image.BufferedImage;

public class ImageComparison
{
	public static boolean findSubImage(BufferedImage subImage, BufferedImage superImage)
	{
		int superWidth = superImage.getWidth();
		int superHeight = superImage.getHeight();
		
		for (int super_x = 0; super_x < superWidth; super_x++){
			for (int super_y = 0; super_y < superHeight; super_y++){
				if (checkSubImage(super_x, super_y, subImage, superImage)){
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean checkSubImage(int super_x, int super_y, BufferedImage subImage, BufferedImage superImage){
		int subWidth = subImage.getWidth();
		int subHeight = subImage.getHeight();
		
		System.out.println(super_x + "," + super_y);
		for (int x = 0; x < subWidth; x++){
			for (int y = 0; y < subHeight; y++){
				
				if (subImage.getRGB(x, y)!= superImage.getRGB(x+super_x, y + super_y)){
					return false;
				}
			}
		}
		
		return true;
	}
	
}
