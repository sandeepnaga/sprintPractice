package org.sandeep.javabrains;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
       System.out.println("pointA="+this.pointA.getX()+"Y="+pointA.getY());
       System.out.println("pointB="+this.pointB.getX()+"Y="+pointB.getY());
       System.out.println("pointC="+this.pointC.getX()+"Y="+pointC.getY());
	}
}
