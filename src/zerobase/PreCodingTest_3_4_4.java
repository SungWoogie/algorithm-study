package zerobase;

// 연속으로 나타나는 1 최대길이
public class PreCodingTest_3_4_4 {
    public static int solution(int[] arr) {
        int answer = 0;
        int currentLength = 0;

        for (int num : arr) {
            if (num == 1) {
                currentLength++;
                answer = Math.max(answer, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0, 1, 1, 1, 0})); // 3
    }
}

