package programmers;

public class Lv1_220705 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        Lv1_220705 lv1_220705 = new Lv1_220705();

        System.out.println(lv1_220705.solution(a, b));

    }

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
