package zerobase;

// 인덱스 위치의 값들이 같은지 찾기
public class PreCodingTest_2_4_4 {
    public static int solution(int[] nums) {
        int answer = 0; // 인덱스 위치 찾기

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] == nums[j]){
                        answer++;
                    }
                }
            }
        }
        answer /= 2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 5, 6, 3, 2, 6, 6})); // 4
    }
}

