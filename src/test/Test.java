package test;

import java.util.*;

public class Test {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    // 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> asd = new ArrayList<>(List.of(SCANNER.nextLine().split(" ")));

        for (int i = 0; i < 3; i++) {
            List<String> list = new ArrayList<>();
            list.add(SCANNER.next());
            list.add(SCANNER.next());
            list.add(String.valueOf(RANDOM.nextInt(3) + 1));

            map.put(asd.get(i), list);
        }
        System.out.println(map);

        for (int i = 0; i < map.size(); i++) {
        }




    }
}