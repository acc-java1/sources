package edu.acc.java1.geometry;

public class Point3D extends Point2D { // inheritance gives us all of Point2D for free
	//public int x; // implied through extension
	//public int y; // implied through extension
	public int z;   // the third dimension is all that's needed to be a 3D point now

	public Point3D() {} // no-args constructor leaves new points at the origin

	public Point3D(int x, int y, int z) { // primary constructor sets all three coordinates
		this.move(x, y, z);
	}

	public Point3D(Point3D other) { // copy constructor duplicates a point
		this(other.x, other.y, other.z); // delegate to another constructor of this class
	}

	public void move(int x, int y, int z) {
		super.move(x, y); // delegate moving in two dimensions to the superclass
		this.z = z;
	}

	public void translate(int dx, int dy, int dz) {
		super.translate(dx, dy);
		this.z += dz;
	}

	public double distanceTo(Point3D other) {
		return Math.sqrt(
			Math.pow((other.x - this.x), 2) +
			Math.pow((other.y - this.y), 2) +
			Math.pow((other.z - this.z), 2)
		);
	}

	public static double distance(Point3D p, Point3D q) {
		return p.distanceTo(q);
	}

	public static double distance(int x1, int y1, int z1, int x2, int y2, int z2) {
		Point3D p = new Point3D(x1, y1, z1);
		Point3D q = new Point3D(x2, y2, z2);
		return Point3D.distance(p, q);
	}

	@Override
	public String toString() {
		return String.format("(%d, %d, %d)", x, y, z);
	}
}
