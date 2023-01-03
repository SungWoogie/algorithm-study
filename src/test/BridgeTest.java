package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BridgeTest {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
        System.out.println("다리 길이를 입력해주세요.");
        int bridgeLength = SCANNER.nextInt();

        String success = "성공";
        String fail = "실패";

        boolean isReplay = true;
        int totalAttemptCount = 0;

        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < bridgeLength; i++) {
            randomNumbers.add(RANDOM.nextInt(2)); // 0 이면 아래, 1이면 위에
        }


        while (isReplay) {
            int upperOCount = 0;
            int lowerOCount = 0;
            totalAttemptCount++;
            isReplay = false;
            StringBuilder upperBridge = new StringBuilder("[");
            StringBuilder lowerBridge = new StringBuilder("[");

            List<String> upperList = new ArrayList<>();
            List<String> lowerList = new ArrayList<>();
            int failCount = 0;
            for (int i = 0; i < bridgeLength; i++) {
                System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
                String move = SCANNER.next(); // 이동하고 싶은 위치 선택
                if (move.equals("U")) {
                    if (randomNumbers.get(i) == 1) {
                        upperList.add(" O ");
                        lowerList.add("   ");
                        upperOCount++;
                    } else {
                        upperList.add(" X ");
                        lowerList.add("   ");
                        failCount++;
                    }
                } else {
                    if (randomNumbers.get(i) == 0) {
                        lowerList.add(" O ");
                        upperList.add("   ");
                        lowerOCount++;
                    } else {
                        lowerList.add(" X ");
                        upperList.add("   ");
                        failCount++;
                    }
                }

                upperBridge.append(upperList.get(i)).append("]");
                lowerBridge.append(lowerList.get(i)).append("]");

                System.out.println(upperBridge);
                System.out.println(lowerBridge);

                if (failCount > 0) {
                    break;
                } else {
                    upperBridge.deleteCharAt(upperBridge.length() - 1);
                    lowerBridge.deleteCharAt(lowerBridge.length() - 1);
                    upperBridge.append("|");
                    lowerBridge.append("|");
                }
                System.out.println();
            }

            if (upperOCount + lowerOCount == bridgeLength) { // 게임 결과
                System.out.println("최종 게임 결과");
                upperBridge.deleteCharAt(upperBridge.length() - 1);
                lowerBridge.deleteCharAt(lowerBridge.length() - 1);
                upperBridge.append("]");
                lowerBridge.append("]");
                System.out.println(upperBridge);
                System.out.println(lowerBridge);
                System.out.println();
                System.out.println("게임 성공 여부: " + success);
                System.out.println("총 시도한 횟수: " + totalAttemptCount);
            } else {
                System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
                if (SCANNER.next().equals("R")) {
                    isReplay = true;
                } else {
                    System.out.println();
                    System.out.println("최종 게임 결과");
                    System.out.println(upperBridge);
                    System.out.println(lowerBridge);
                    System.out.println();
                    System.out.println("게임 성공 여부: " + fail);
                    System.out.println("총 시도한 횟수: " + totalAttemptCount);
                }
            }
        }
    }
}