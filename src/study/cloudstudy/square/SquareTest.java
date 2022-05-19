package study.cloudstudy.square;

public class SquareTest {
    public static void main(String[] args) {
        int length = 4;
        int area = 16;

        Square square = new Square(length, area);

        System.out.println("한 변의 길이가 " + square.getLength() + "인 정사각형의 넓이: " + square.getArea());
    }

    public static class Square {
        private final int length;
        private final int area;

        public Square(int length, int area) {
            this.length = length;
            this.area = area;
        }

        public int getLength() {
            return length;
        }

        public int getArea() {
            return area;
        }
    }
}
