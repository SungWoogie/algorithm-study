package zerobase;

// n 이하의 가장 큰 수 반환
public class PreCodingTest_3_2_5 {
    public static int solution(int[] arr, int n) {
        int answer = 0;
        for (int num : arr) {
            if (num <= n) {
                answer = Math.max(answer, num);
            }
        }
        if (answer == 0) {
            return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 1, 5}, 5)); // 5
        System.out.println(solution(new int[]{10, 50, 20, 44}, 9)); // -1
    }

}

