package com.robo2D.roboProject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeInput extends KeyAdapter {
	
	SquareRoomImplClass sric;
	
	public KeyCodeInput ( SquareRoomImplClass sric ) {
		// TODO Auto-generated constructor stub
		this.sric=sric;
	}
	
	public void keyPressed (KeyEvent ke ) {
		sric.keyPressed(ke);
	}
	
	public void keyTyped (KeyEvent ke) {
		sric.keyTyped(ke);
	}
	
	public void keyReleased(KeyEvent ke) {
		sric.keyReleased(ke);
	}

}


