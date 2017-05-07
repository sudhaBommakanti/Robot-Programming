package com.robo2D.roboProject;

import static org.junit.Assert.*;
import org.junit.Test;

import java.awt.Point;
import java.io.IOException;

public class SquareRoomTest {

	private String testData = "ROBOT2D";
	
	@Test
	public void squareRoomTestStartPosition() {
		
		try {
		SquareRoomImplClass sric = new SquareRoomImplClass(testData);
		
		Point actualPosition = sric.getStartPosition();
		Point expectedPosition = new Point(100,300);
		
		assertEquals(expectedPosition,actualPosition);
		
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Test
	public void squareRoomTestContains() {
		
		try {
		SquareRoomImplClass sric = new SquareRoomImplClass(testData);
		
		Point actualPosition = sric.getStartPosition();
		boolean actual = sric.contains(actualPosition);
		boolean expected = true;
		
		assertEquals(expected,actual);
		
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Test
	public void squareRoomXBoundariesTest() {
		
		try {
			SquareRoomImplClass sric = new SquareRoomImplClass(testData);
		
			Point currPosition = sric.getStartPosition();
			
			assertFalse((((currPosition.x/100) > 5) && ((currPosition.x/100) < 0)));
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@Test
	public void squareRoomYBoundariesTest() {
		
		try {
			SquareRoomImplClass sric = new SquareRoomImplClass(testData);
		
			Point currPosition = sric.getStartPosition();
			
			assertFalse((((500 - currPosition.y)/100 > 5) && ((500 - currPosition.y)/100 < 0)));
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
