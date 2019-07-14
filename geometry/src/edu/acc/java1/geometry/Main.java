package edu.acc.java1.geometry;

public class Main {
	public static void main(String[] args) {
		// Declare two Point2D references
		// This is made possible by virtue of Point2D being public
		// This feature is available from the first version of Point2D on
		Point2D p;
		Point2D q;

		// instantiate points using int coordinates
		// this is possible from the third version of Point2D on
		p = new Point2D(-7, 4);
		q = new Point2D(0, p.x);
		// add a no-args constructor to accept member defaults
		// this feature is available from the fourth version on
		Point2D r = new Point2D();

		// printing our points is possible from version1 on -
		// println() calls the toString() method of its argument
		// points have a toString() inherited from java.lang.Object
		// if we override toString(), we can customize its behavior
		System.out.println(p);
		System.out.println(q);

		r.move(q.x, q.y);
		r.translate(3, -3);
		System.out.println(r);

		double distanceFromPtoQ = p.distanceTo(q);
		double distanceFromQtoP = q.distanceTo(p);
		System.out.printf("p to q: %f, q to p: %.2f\n", distanceFromPtoQ,
			distanceFromQtoP);
		System.out.printf("Distance from p to q: %.2f\n", Point2D.distance(p, q));
		System.out.printf("Distance from (2,2) to (-2,-2): %.2f\n", Point2D.distance(2, 2, -2, -2));
	}
}




