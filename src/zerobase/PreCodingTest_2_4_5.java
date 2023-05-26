package zerobase;

// 해당 문자열의 접두사의 개수 찾기
public class PreCodingTest_2_4_5 {
    public static int solution(String[] array, String s) {
        int answer = 0;
        for (String str : array) {
            if (s.startsWith(str)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"n", "nav", "nev"},"naver")); // 2
    }
}

