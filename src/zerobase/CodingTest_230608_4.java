package zerobase;

public class CodingTest_230608_4 {
    public static int solution(int n, int i, int j) {
        int size = (int) Math.pow(2, n);

        int[][] arr = new int[size][size];

        // (ㄷ) 디귿자로 숫자를 채움
        fillNumbers(arr, 0, 0, size, 1);

        // i행 j열의 값을 반환
        return arr[i][j];
    }

    // (ㄷ) 디귿자로 숫자를 채우는 메서드
    public static void fillNumbers(int[][] arr, int row, int col, int size, int startNum) {
        if (size == 2) {
            arr[row][col] = startNum++;
            arr[row][col + 1] = startNum++;
            arr[row + 1][col] = startNum++;
            arr[row + 1][col + 1] = startNum++;
            return;
        }

        int halfSize = size / 2;
        fillNumbers(arr, row, col, halfSize, startNum);  // 좌측 상단 영역
        fillNumbers(arr, row, col + halfSize, halfSize, startNum + halfSize * halfSize);  // 우측 상단 영역
        fillNumbers(arr, row + halfSize, col, halfSize, startNum + 2 * halfSize * halfSize);  // 좌측 하단 영역
        fillNumbers(arr, row + halfSize, col + halfSize, halfSize, startNum + 3 * halfSize * halfSize);  // 우측 하단 영역
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 1, 3)); // 4

    }
}
