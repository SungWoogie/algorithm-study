package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BridgeTest2 {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        printStartMessage();
        int bridgeLength = inputBridgeLength();
        List<Integer> randomNumbers = createRandomNumbers(bridgeLength);
        boolean isRetry = true;
//        while (isRetry) {
        List<List<String>> asd = addBridgeStatus(bridgeLength, inputSelectZoneMove(), randomNumbers);
        for (List<String> s : asd) {
            System.out.println(s);
        }
    }

//        }


    public static void printStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
    }

    public static int inputBridgeLength() {
        System.out.println("다리의 길이를 입력해주세요.");
        return SCANNER.nextInt();
    }

    public static List<Integer> createRandomNumbers(int bridgeLength) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < bridgeLength; i++) {
            randomNumbers.add(RANDOM.nextInt(2));
        }
        return randomNumbers;
    }

    public static List<List<String>> addBridgeStatus(int bridgeLength, String selectZone, List<Integer> randomNumbers) {
        List<List<String>> allBridges = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            List<String> bridges = new ArrayList<>();
            for (int j = 0; j < 2; j++) {

//                bridges.s(i,)
                allBridges.add(bridges);
            }
        }
        return allBridges;
    }

    public static String inputSelectZoneMove() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        return SCANNER.next();
    }

}