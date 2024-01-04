package zerobase;

public class CT_18_3 {
    public static String solution(int[][] points) {
        int crossProduct =
                (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                        (points[1][1] - points[0][1]) * (points[2][0] - points[0][0]);

        if (crossProduct > 0) {
            return "CCW";
        } else if (crossProduct < 0) {
            return "CW";
        } else {
            return "LINE";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0}, {0, 10}, {10, 5}})); //cw
        System.out.println(solution(new int[][]{{-2, 3}, {-2, 6}, {-2, 9}})); //line
    }
}
