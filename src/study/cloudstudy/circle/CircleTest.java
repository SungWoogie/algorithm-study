package study.cloudstudy.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, 0, 3);
        Circle c2 = new Circle(2, 3, 4);

        double area1 = Circle.area(c1);
        double area2 = Circle.area(c2);

        System.out.printf("%s => 넓이: %.2f\n", c1.toStr(), area1);
        System.out.printf("%s => 넓이: %.2f\n", c2.toStr(), area2);
    }
}
