package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bridge {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println(); // 줄 띄움
        System.out.println("다리의 길이를 입력해주세요.");
        int inputBridgeLength = scanner.nextInt();
        System.out.println(); // 줄 띄움


        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < inputBridgeLength; i++) {
            randomList.add(random.nextInt(2)); // 0 or 1 (0 : 아래), (1 : 위) 갈 수 있음
        }

        System.out.println(randomList);

        List<String> successList = new ArrayList<>();

        int count = 0;
        int stickCount = 0;

        StringBuilder upBuilder = new StringBuilder();
        StringBuilder downBuilder = new StringBuilder();
        for (int i = 0; i < inputBridgeLength; i++) {
            String inputString = selectText();
            if (stickCount == 0) { // 처음 대괄호 추가 기능
                upBuilder.append("[ ");
                downBuilder.append("[ ");
            }
            if (inputString.equals("U")) { // 위에 칸 선택
                if (randomList.get(i) == 1) {
                    upBuilder.append("O").append(" | ");
                    downBuilder.append(" ").append(" | ");
                    count++;
                } else if (randomList.get(i) == 0) {
                    upBuilder.append("X").append("]");
                    downBuilder.append(" ").append("]");
                }
            } else if (inputString.equals("D")) {
                if (randomList.get(i) == 0) {
                    downBuilder.append("O").append(" | ");
                    upBuilder.append(" ").append(" | ");
                    count++;
                } else if (randomList.get(i) == 1) {
                    downBuilder.append("X").append("]");
                }
            }
            System.out.println(upBuilder);
            System.out.println(downBuilder);

        }
        finalGameResult();
        if (count == inputBridgeLength) {
            upBuilder.append("]");
            downBuilder.append("]");
        }

        if (count == inputBridgeLength) {
            String success = "성공";
            totalCount(success, count);
        } else {
            String fail = "실패";
            totalCount(fail, count);
        }
    }

    public static String selectText() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D");
        return scanner.next();
    }

    public static boolean isReplayGame() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String replay = scanner.next();
        return replay.equals("R");
    }

    public static void finalGameResult() {
        System.out.println("최종 게임 결과");

    }

    public static void totalCount(String success, int count) {
        System.out.println("게임 성공 여부: " + success);
        System.out.println("총 시도한 횟수: " + count);
    }

}
