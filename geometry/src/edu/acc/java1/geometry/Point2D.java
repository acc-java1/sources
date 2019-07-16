package edu.acc.java1.geometry;

/*
	NOTE WELL: This class doesn't compile since it redefines Point2D
	many times. Any one version should compile fine however. Comment
	out all but the last version to use with Main.java.
*/
/*
// the bare minimum point
public class Point2D {
	int x;
	int y;
}

// package (default) access is only infrequently the right way to go
// as long as the int-to-coordinate model is accurate, make members public
public class Point2D {
	public int x;
	public int y;
}

// a primary constructor makes it easy to situate a point
// at specific coordinates
public class Point2D {
	public int x;
	public int y;

	public Point2D(int a, int b) {
		x = a;
		y = b;
	}
}

// it's more self-documenting for method parameter names
// to match the properties they're setting; of course, this
// causes member hiding so we need the this-reference to
// disambiguate
public class Point2D {
	public int x;
	public int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// adding a constructor disables the default constructor
// so we add back in the no-args constructor when it makes sense
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//  add a service to display coordinates
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.printf("(%d,%d)\n", x, y);
	}
}

// return a reusable String in (x,y) notation so
// the caller can decide how to use it
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String display() {
		return String.format("(%d,%d)", x, y);
	}
}

// override an existing API to display points
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

// use an annotation to be sure our override actually overrides
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

// add a service to move points - oops, it's not DRY
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

// version 9 - DRY utility methods
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		this.move(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void translate(int dx, int dy) {
		this.move (x + dx, y + dy);
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

// service to determine distance to another point from this one
public class Point2D {
	public int x;
	public int y;

	public Point2D() {}

	public Point2D(int x, int y) {
		move(x, y);
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void translate(int dx, int dy) {
		this.move(x + dx, y + dy);
	}

	public double distanceTo(Point2D other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(
			Math.pow(dx, 2) +
			Math.pow(dy, 2)
		);
    }

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}
}

// add a method to compare two points independently
public class Point2D {
    public int x;
    public int y;

    public Point2D() {}

    public Point2D(int x, int y) {
        move(x, y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.move(x + dx, y + dy);
    }

    public double distanceTo(Point2D other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(
            Math.pow(dx, 2) +
            Math.pow(dy, 2)
        );
    }

	public static double distance(Point2D a, Point2D b) {
		return a.distanceTo(b);
	}

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
*/
// add a service to calculate distance with only coordinates
public class Point2D {
    public int x;
    public int y;

    public Point2D() {}

    public Point2D(int x, int y) {
        move(x, y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.move(x + dx, y + dy);
    }

    public double distanceTo(Point2D other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        return Math.sqrt(
            Math.pow(dx, 2) +
            Math.pow(dy, 2)
        );
    }

	public static double distance(Point2D a, Point2D b) {
		return a.distanceTo(b);
	}

	public static double distance(int x1, int y1, int x2, int y2) {
		return distance(new Point2D(x1, y1), new Point2D(x2, y2));
	}

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
