package programmers;

public class Challenger_15 {
    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        System.out.println(solution(str));

    }

    public static String solution(String str) {
        String[] text = str.split(" ");
        int[] num = new int[text.length];

        for (int i = 0; i < text.length; i++) {
            num[i] = Integer.parseInt(text[i]);
        }

        int min = num[0];
        int max = num[0];

        for (int i = 1; i < text.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min + " " + max;

    }
}
