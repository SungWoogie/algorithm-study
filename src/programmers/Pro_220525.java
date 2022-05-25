package programmers;

public class Pro_220525 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) { // 2016
        String answer;
        int[] monthArr = {31, 29, 31, 30, 31, 30, 29, 31, 30, 31, 30, 30};
        String[] dayArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int day = 0;

        for (int i = 1; i < a; i++) {
            day += monthArr[i - 1];
        }
        day += b - 1; // 1월 1일도 하루 지난 것으로 되어 -1
        answer = dayArr[(day + 5) % 7]; // 1월 1일이 금요일이라서 +5 를 하고 % 7 을 하였다.
        return answer;
    }
}
