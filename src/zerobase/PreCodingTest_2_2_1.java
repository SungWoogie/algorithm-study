package zerobase;

// 전기 사용량
public class PreCodingTest_2_2_1 {
    public static int solution(int[] useageArr, int fee) {
        int answer = 0;
        for (int useage : useageArr) {
            answer += useage;
        }
        answer *= fee;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 5}, 5)); // 45
    }
}

