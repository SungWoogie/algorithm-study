package programmers;

public class Challenger_14 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    public static StringBuilder solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sb.append("박");
            } else {
                sb.append("수");
            }
        }
        return sb;
    }
}
