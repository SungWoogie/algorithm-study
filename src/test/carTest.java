package test;

import java.util.*;

public class carTest {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String inputCarName = SCANNER.nextLine();
        List<String> carNames = List.of(inputCarName.split(","));
        System.out.println("시도할 횟수는 몇회인가요?");
        int repeatCount = SCANNER.nextInt();
        System.out.println();
        System.out.println("실행 결과");

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < carNames.size(); i++) {
            positions.add(0);
        }
        for (int i = 0; i < repeatCount; i++) {
            for (int j = 0; j < carNames.size(); j++) {
                if (RANDOM.nextInt(10) >= 4) {
                    int position = positions.get(j) + 1;
                    positions.set(j, position);
                }
                System.out.print(carNames.get(j) + " : ");
                for (int k = 0; k < positions.get(j); k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }

        for (int j = 0; j < carNames.size(); j++) {
            System.out.print(carNames.get(j) + " : ");
            for (int k = 0; k < positions.get(j); k++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();

        int max = 0;
        for (int j : positions) {
            max = Math.max(j, max);
        }
        StringBuilder winnerNames = new StringBuilder();
        for (int i = 0; i < positions.size(); i++) {
            if (max == positions.get(i)) {
                winnerNames.append(carNames.get(i)).append(", ");
            }
        }
        winnerNames.delete(winnerNames.length() - 2, winnerNames.length());
        System.out.println(winnerNames.append("가 최종 우승했습니다."));
    }
}
