package zerobase;

// b 로 이루어져 있는지 확인
public class PreCodingTest_3_2_4 {
    public static boolean solution(boolean[][] matrix, boolean b) {
        boolean answer = true;
        boolean a = !b;
        for (boolean[] booleans : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                if (booleans[i] == a) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new boolean[][]{
                {true, true, true, true},
                {true, true, false, true},
                {true, false, true, true},
                {true, true, true, true}}, true)); // false
    }

}

