import edu.princeton.cs.algs4.StdDraw;

public class LineSegment {
    private final Point p;   // one endpoint of this line segment
    private final Point q;   // the other endpoint of this line segment

    /**
     * Initializes a new line segment.
     *
     * @param  p one endpoint
     * @param  q the other endpoint
     * @throws NullPointerException if either <tt>p</tt> or <tt>q</tt>
     *         is <tt>null</tt>
     */
    public LineSegment(Point p, Point q) {
        if (p == null || q == null) {
            throw new IllegalArgumentException("argument to LineSegment constructor is null");
        }
        if (p.equals(q)) {
            throw new IllegalArgumentException("both arguments to LineSegment constructor are the same point: " + p);
        }
        this.p = p;
        this.q = q;
    }


    /**
     * Draws this line segment to standard draw.
     */
    public void draw() {
        p.drawTo(q);
    }

    /**
     * Returns a string representation of this line segment
     * This method is provide for debugging;
     * your program should not rely on the format of the string representation.
     *
     * @return a string representation of this line segment
     */
    public String toString() {
        return p + " -> " + q;
    }

    /**
     * Throws an exception if called. The hashCode() method is not supported because
     * hashing has not yet been introduced in this course. Moreover, hashing does not
     * typically lead to good *worst-case* performance guarantees, as required on this
     * assignment.
     *
     * @throws UnsupportedOperationException if called
     */
    public int hashCode() {
        throw new UnsupportedOperationException("hashCode() is not supported");
    }

    public static void main(String[] args) {
        Point p1 = new Point(15000,18000);
        Point p2 = new Point(8000,22000);
        Point p3 = new Point(600,9000);
        Point p4 = new Point(9000,5000);
        Point p5 = new Point(12000,10000);

        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLUE);

        p1.draw();
        p2.draw();
        p3.draw();
        p4.draw();
        p5.draw();
        StdDraw.show();

        StdDraw.setPenColor(StdDraw.MAGENTA);
        p1.drawTo(p5);
        p2.drawTo(p4);
        StdDraw.setPenColor(StdDraw.RED);
        p3.drawTo(p2);
        StdDraw.show();

    }
}
