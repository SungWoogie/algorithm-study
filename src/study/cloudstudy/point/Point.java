package study.cloudstudy.point;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toStr() {
        return String.format("(%d, %d)", x, y);
    }

    public static double distance(Point p, Point q) {
        double dX = p.x - q.x;
        double dY = p.y - q.y;
        return Math.sqrt((dX * dX) + (dY * dY));
    }


}
