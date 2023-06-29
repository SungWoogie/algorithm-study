package zerobase;

public class CodingTest_230622_4 {
    public static int solution(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);

        if (dx == 0 && dy == 0)
            return 0;

        int distance = Math.max(dx, dy);
        if (dx == dy)
            return distance;
        else
            return distance - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 4, 5, -3)); // 4
        System.out.println(solution(-2, 5, 4, 2)); // 3
    }
}
