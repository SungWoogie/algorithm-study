package zerobase;

// n 등장 횟수 찾기
public class PreCodingTest_3_2_1 {
    public static int solution(String s, int n) {
        int answer = 0;
        String[] strings = s.split("");

        for (String str : strings) {
            if (Integer.parseInt(str) == n) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("134246", 4)); // 2
    }
}

