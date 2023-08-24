package zerobase;

public class CodingTest_230824_1 {
    public static int solution(String s) {
        int operations = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'a') {
                i++;
                continue;
            }

            int count = 0;
            while (i < s.length() && s.charAt(i) != 'a') {
                i++;
                count++;
            }

            operations += Math.min(count, 1);
        }
        return operations;
    }

    public static void main(String[] args) {
        System.out.println(solution("azbacefbaaaa"));
    }

}
