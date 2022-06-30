package programmers;


public class Lv1_Pro_220630_1 {
    public boolean solution(int x) {

        int result = 0;
        int num = x;
        while (num > 0) {
            int percent = num % 10;
            num /= 10;
            result += percent;
        }
        return x % result == 0;

    }

    public static void main(String[] args) {
        int x = 999;
        Lv1_Pro_220630_1 s = new Lv1_Pro_220630_1();

        System.out.println(s.solution(x));
    }
}
