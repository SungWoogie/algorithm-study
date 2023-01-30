package programmers;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] str = new String[]{"ayaye","ma"};
        List<String> list = List.of("ayaye", "ma");
        String ye = "ma";

        if (list.contains(ye)) {
            System.out.println(true);
        }
        System.out.println(false);
    }
}
