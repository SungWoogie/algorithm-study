package programmers;

public class Ex_TwoThousandSixteen {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer = solution(a, b);
        System.out.println(answer);

    }

    public static String solution(int a, int b) {
        String[] word = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int date = 0;
        for (int i = 0; i < a - 1; i++) {
            date += day[i];
        }
        date += b - 1;

        return word[date % word.length];
    }
}
