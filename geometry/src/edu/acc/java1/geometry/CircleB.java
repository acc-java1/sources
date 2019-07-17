package edu.acc.java1.geometry;

public class CircleB extends Point2D {
	private int radius = 1;

	public CircleB() {}

	public CircleB(int x, int y, int radius) {
		super(x, y);
		setRadius(radius);
	}

	public CircleB(Point2D center, int radius) {
		this(center.x, center.y, radius);
	}

	public CircleB(CircleB other) {
		this(other.x, other.y, other.radius);
	}

	public int getRadius() { return radius; }

	public void setRadius(int radius) {
		this.radius = radius > -1 ? radius : -radius;
	}

	public Point2D getCenter() {
		return new Point2D(x, y);
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
		return String.format("Circle[%s:%d]", super.toString(), radius);
	}
}
