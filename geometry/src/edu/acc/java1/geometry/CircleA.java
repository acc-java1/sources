package edu.acc.java1.geometry;

public class CircleA {
	private Point2D center = new Point2D();
	private int radius = 1;

	public CircleA() {}

	public CircleA(int x, int y, int radius) {
		setCenter(x, y);
		setRadius(radius);
	}

	public CircleA(Point2D center, int radius) {
		this(center.x, center.y, radius);
	}

	public CircleA(CircleA other) {
		this(other.center.x, other.center.y, other.radius);
	}

	public void move(int x, int y) {
		center.move(x, y);
	}

	public void translate(int dx, int dy) {
		move(center.x + dx, center.y + dy);
	}

	public int getRadius() { return radius; }

	public void setRadius(int radius) {
		this.radius = radius > -1 ? radius : -radius;
	}

	public Point2D getCenter() {
		return new Point2D(center.x, center.y);
	}

	public void setCenter(int x, int y) {
		move(x, y);
	}

	public void setCenter(Point2D center) {
		move(center.x, center.y);
	}

	public double getCircumference() {
		return Math.PI * 2 * radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return String.format("Circle[%s:%d]", center.toString(), radius);
	}
}
