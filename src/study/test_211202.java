package study;

public class test_211202 {
    public static void main(String[] args) {
        int x = 222;

        int percent = 0;
        int divide = 0;

        while (10 < x) {
            percent = x % 10;
            divide = x / 10;
            x = divide;

            System.out.println(x);
        }

    }
}
