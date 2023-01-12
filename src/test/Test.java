package test;

import java.util.*;

public class Test {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
// 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(SCANNER.next());
        }
        Collections.sort(list);
        System.out.println(list);


    }
}