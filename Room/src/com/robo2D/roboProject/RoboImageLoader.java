package com.robo2D.roboProject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RoboImageLoader {
	
	private BufferedImage image;
	private static final String IMG_PATH = "C:/Users/Sudha/workspace/Room/res/images/robo.jpg";

	
	public RoboImageLoader() {
		// TODO Auto-generated constructor stub
	}
	
	public BufferedImage loadImage() throws IOException {
		image = ImageIO.read(new File(IMG_PATH));
		return image;
	}
}






	
				
	
	
	
