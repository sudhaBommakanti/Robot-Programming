package com.robo2D.roboProject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.swing.JFrame;

public class SquareRoomImplClass extends Canvas implements Room  {
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 305;
	private static final int HEIGHT = 305;
	private static final int SCALE = 2;
	private final String TITLE = "Robot 2D Square";
	
	private BufferedImage image = new BufferedImage(WIDTH, HEIGHT,BufferedImage.TYPE_INT_RGB);
	private BufferedImage robot = null;
	
	private Point currPosition;
	private String vector;
	
	private RobotCls r;
	
	//TODO Auto-generated constructor stub
	public SquareRoomImplClass(String s) throws IOException {
		RoboImageLoader  loader = new RoboImageLoader();
		
		try{
			robot = loader.loadImage();
		} catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		addKeyListener(new KeyCodeInput(this));
		
		currPosition = getStartPosition();
		r = new RobotCls(currPosition.x, currPosition.y, robot);
	}

	public void render(){
		BufferStrategy bs = this.getBufferStrategy();

		if(bs == null){
			createBufferStrategy(2);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this); 
		r.render(g);
		g.dispose();
		bs.show();		
	}

	public void keyPressed(KeyEvent ke) {
		int key = ke.getKeyCode();
		
		if ((key == KeyEvent.VK_F) || (key == KeyEvent.VK_G)) {
			if(((r.getY() == 0) && (vector.equals("N"))) || ((r.getX() == 500) && (vector.equals("E"))) || ((r.getX() == 0) && (vector.equals("W"))) || ((r.getY() == 500) && (vector.equals("S")))) {
				System.out.println("Out of Boundaries...");
				return;
			} else {
				if(vector.equals("N")) {
					r.setY(r.getY() - 100);
					currPosition.y = (int) r.getY();
					vector = "N";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("E")) {
					r.setX(r.getX() + 100);
					currPosition.x = (int) r.getX();
					vector = "E";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("S")) {
					r.setY(r.getY() + 100);
					currPosition.y = (int) r.getY();
					vector = "S";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("W")) {
					r.setX(r.getX() - 100);
					currPosition.x = (int) r.getX();
					vector = "W";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				}
			}
			render();
		} else if ((key == KeyEvent.VK_D) || (key == KeyEvent.VK_N)) {
			if(((r.getY() == 0) && (vector.equals("N"))) || ((r.getX() == 500) && (vector.equals("E"))) || ((r.getX() == 0) && (vector.equals("W"))) || ((r.getY() == 500) && (vector.equals("S")))) {
				System.out.println("Out of Boundaries..");
				return;
			} else {
				r.setY(r.getY() + 100);
				currPosition.y = (int) r.getY();
				System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100));
				
			}
			render();
		} else if ((key == KeyEvent.VK_L) || (key == KeyEvent.VK_V)){
			if(((r.getX() == 0) && (vector.equals("N"))) || ((r.getY() == 0) && (vector.equals("E"))) || ((r.getX() == 500) && (vector.equals("S"))) || ((r.getY() == 500) && (vector.equals("W")))){
				System.out.println("Out of Boundaries.....");
				return;
			} else {
				if(vector.equals("N")) {
					r.setX(r.getX() - 100);
					currPosition.x = (int) r.getX();
					vector = "W";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("S")) {
					r.setX(r.getX() + 100);
					currPosition.x = (int) r.getX();
					vector = "E";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("E")) {
					r.setY(r.getY() - 100);
					currPosition.y = (int) r.getY();
					vector = "N";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("W")) {
					r.setY(r.getY() + 100);
					currPosition.y = (int) r.getY();
					vector = "S";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				}
		   }
			render();
		} else if ((key == KeyEvent.VK_R) || (key == KeyEvent.VK_H)) {
			if(((r.getX() == 500) && (vector.equals("N"))) || ((r.getX() == 0) && (vector.equals("S"))) || ((r.getY() == 0) && (vector.equals("W"))) || ((r.getY() == 500) && (vector.equals("E")))) {
				System.out.println("Out of Boundaries.....");
				return;
			} else {
				if(vector.equals("N")) {
					r.setX(r.getX() + 100);
					currPosition.x = (int) r.getX();
					vector = "E";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("S")) {
					r.setX(r.getX() - 100);
					currPosition.x = (int) r.getX();
					vector = "W";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("E")) {
					r.setY(r.getY() + 100);
					currPosition.y = (int) r.getY();
					vector = "S";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				} else if(vector.equals("W")) {
					r.setY(r.getY() - 100);
					currPosition.y = (int) r.getY();
					vector = "N";
					System.out.println("Key Pressed:" + (currPosition.x/100) + " " + ((500 - currPosition.y)/100) + " " + vector);
				}
			  }
			render();
		 } else {
			   keyTyped(ke);
		 }
	}
		
	
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		if (ke.getKeyChar() == 27)  {
			System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent ke) {
		
	}
	
	public Point getStartPosition() {
		// TODO Auto-generated method stub
		
		Point currPosition = new Point();
		currPosition.x = 100;
		currPosition.y = 300;
		vector = "N";
		return currPosition;
		
	}

	@Override
	public boolean contains (Point currPosition) {
		// TODO Auto-generated method stub
		
		if((((currPosition.x/100) > 5) && ((currPosition.x/100) < 0)) || (((500 - currPosition.y)/100 > 5) && ((500 - currPosition.y)/100 < 0))) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String args[]) throws IOException {
		SquareRoomImplClass sric = new SquareRoomImplClass("Robot 2D");
		
		sric.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		sric.setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		sric.setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));

		JFrame frame = new JFrame(sric.TITLE);
	 	frame.add(sric);
		frame.pack();
		frame.setBackground(Color.gray);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sric.render();
	}
}