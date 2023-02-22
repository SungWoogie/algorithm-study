package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberTest {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                list.add(RANDOM.nextInt(45) + 1);
            }
            System.out.println(list);
            list.clear();
        }

    }
}
