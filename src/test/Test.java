package test;

import java.util.*;

public class Test {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    // 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규

    //    (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위, 4번째 최고 등급)
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

//        List<String> firstList = new ArrayList<>(List.of(SCANNER.nextLine().split(" ")));

        for (int i = 0; i < 6; i++) {
            List<String> list = new ArrayList<>();
            list.add(SCANNER.next()); // 랭크 0
            list.add("일반선수"); // 1
            list.add(String.valueOf(RANDOM.nextInt(6) + 1)); // 주사위 2
            list.add(String.valueOf(RANDOM.nextInt(3) + 1)); // 등급 3
            map.put(list.get(0), list);
        }

        for (Map.Entry<String, List<String>> tamp : map.entrySet()) {
            int sum = Integer.parseInt(tamp.getValue().get(2)) + Integer.parseInt(tamp.getValue().get(3));
            tamp.getValue().add(String.valueOf(sum));
        }
        for (Map.Entry<String, List<String>> tamp : map.entrySet()) {
            System.out.println(tamp);
        }

        int max = 0; // 최대값
        for (Map.Entry<String, List<String>> tamp : map.entrySet()) {
            max = Math.max(max, Integer.parseInt(tamp.getValue().get(4)));
        }
        System.out.println(max);

        int secondMax = 0;
        for (Map.Entry<String, List<String>> tamp : map.entrySet()) {
            if (max != Integer.parseInt(tamp.getValue().get(4))) {
                secondMax = max;
            }
        }




    }
}