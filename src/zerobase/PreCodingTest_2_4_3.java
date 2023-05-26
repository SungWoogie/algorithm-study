package zerobase;

// S1 문자열 나눠서 회전시켰을 때 같은 문자인지 찾기
public class PreCodingTest_2_4_3 {
    public static int solution(String S1, String S2) {
        if (S1.length() != S2.length()) { // 길이 비교
            return 0;
        }

        String concat = S1 + S1; // S1 에 대한 문자열을 한번더 붙이고
        if (concat.contains(S2)) { // S2 에 대한 문자열을 포함하고 있는지 확인.
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("HelloWorld", "WorldHello")); // 1
    }
}

