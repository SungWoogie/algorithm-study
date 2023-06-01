package test;

import java.util.Random;

public class Test_230531 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextLong() + 1);
            System.out.println(Long.MAX_VALUE);
        }
    }
}
