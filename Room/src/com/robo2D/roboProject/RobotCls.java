package com.robo2D.roboProject;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class RobotCls {
	private BufferedImage img;
	private double x;
	private double y;

	public RobotCls(double x, double y, BufferedImage image) {
		
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		img = image;
	}
	
	public void render(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}
	
	public double getX(){
		return this.x;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
}




