package study.cloudstudy.circle;

public class Circle {
    private final int x;
    private final int y;
    private final int r;

    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    String toStr() {
        return String.format("Circle { 중심: (%d, %d), 반지름: %d }", x, y, r);
    }

    public static double area(Circle c) {
        return Math.PI * c.r * c.r;
    }
}
