package com.evanhoffman.btests.Pathfinder;

import java.util.LinkedList;

public class Point {

	private LinkedList<Point> path = null;
	private int xCoord;
	public int getxCoord() {
		return xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	private int yCoord;
	
	@SuppressWarnings("unchecked")
	public Point(LinkedList<Point> prevPath, int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		path = (LinkedList<Point>)prevPath.clone();
		path.add(this);
	}

	@SuppressWarnings("unchecked")
	public Point(Point prevPoint, Direction direction) {
		switch (direction) {
		case UP:
			this.xCoord = prevPoint.xCoord;
			this.yCoord = prevPoint.yCoord + 1;
			break;
		case RIGHT: 
			this.xCoord = prevPoint.xCoord + 1;
			this.yCoord = prevPoint.yCoord;
			break;
		}
		path = (LinkedList<Point>)prevPoint.path.clone();
		path.add(this);
		
	}
	
	
	
	public void printPath() {
		System.out.println( path);
	}
	
	@Override
	public String toString() {
		return "[" + xCoord + ","+yCoord + "]";
	}
	
	public static enum Direction {
		UP,
		RIGHT
	}
}
