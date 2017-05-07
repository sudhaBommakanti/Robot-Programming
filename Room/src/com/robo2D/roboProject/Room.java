package com.robo2D.roboProject;
import java.awt.Point;

public interface Room {
	Point getStartPosition();
	boolean contains (Point position);
}
