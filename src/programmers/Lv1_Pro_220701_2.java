package programmers;

public class Lv1_Pro_220701_2 {
    public boolean solution(int x) {
        boolean answer = true;

        int temp = x;
        int result = 0;

        while (temp > 0) {
            int percent = temp % 10; // 9
            temp /= 10; // 99
            result += percent; // 9
        }
        if (x % result == 0) {
            return answer;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        int n = 999;
        Lv1_Pro_220701_2 s = new Lv1_Pro_220701_2();

        System.out.println(s.solution(n));
    }
}
