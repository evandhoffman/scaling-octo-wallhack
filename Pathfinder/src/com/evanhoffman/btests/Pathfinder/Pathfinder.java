package com.evanhoffman.btests.Pathfinder;

import java.util.LinkedList;

public class Pathfinder {
	
		
	public static void main(String[] args) {
		LinkedList<Point> path = new LinkedList<Point>();
		
		Point origin = new Point(path, 0, 0);
		
		int fieldSize = Integer.parseInt(args[0]);

		walkPath(origin, fieldSize);
		
	}
	
	public static void walkPath(Point p, int fieldSize) {
		if (p.getxCoord() < fieldSize) {
			walkPath(new Point(p, Point.Direction.RIGHT), fieldSize);
		}
		if (p.getyCoord() < fieldSize) {
			walkPath(new Point(p, Point.Direction.UP), fieldSize);
		}
		if (p.getxCoord() == fieldSize && p.getyCoord() == fieldSize) {
			p.printPath();
		}
	}
}
