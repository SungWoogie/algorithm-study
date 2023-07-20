package zerobase;

public class CodingTest_230720_1 {
    public static String solution(int[][] img) {
        int n = img.length;

        if (isAllSame(img, n)) {
            return String.valueOf(img[0][0]);
        }

        int half = n / 2;

        int[][] topLeft = new int[half][half];
        int[][] topRight = new int[half][half];
        int[][] bottomLeft = new int[half][half];
        int[][] bottomRight = new int[half][half];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                topLeft[i][j] = img[i][j];
                topRight[i][j] = img[i][j + half];
                bottomLeft[i][j] = img[i + half][j];
                bottomRight[i][j] = img[i + half][j + half];
            }
        }

        return '(' +
                solution(topLeft) +
                solution(topRight) +
                solution(bottomLeft) +
                solution(bottomRight) +
                ')';
    }

    private static boolean isAllSame(int[][] img, int n) {
        int val = img[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{
                {0, 0},
                {0, 0}})); // 0
        System.out.println(solution(new int[][]{
                {0, 1},
                {1, 0}})); // 0110
        System.out.println(solution(new int[][]{
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 0, 0}
        })); // (011(0110))
    }

}