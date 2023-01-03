//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class 성준 {
//
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private static final Random RANDOM = new Random();
//
//
//    public static void main(String[] args) {
//
//        int 다리길이 = 다리길이입력받기();
//        boolean isReplay = true;
//        int successCount = 0;
//        while (isReplay) {
//            int upperOCount = 0;
//            int lowerOCount = 0;
//            successCount = 게임시도횟수(successCount);
//            isReplay = 게임시작단계();
//            StringBuilder upperBridge = new StringBuilder("[");
//            StringBuilder lowerBridge = new StringBuilder("[");
//            List<String> upperList = new ArrayList<>();
//            List<String> lowerList = new ArrayList<>();
//            int failCount = 0;
//            다리건너기시작(다리길이);
//        }
//    }
//
//    public static int 다리길이입력받기() {
//        System.out.println("다리 건너기 게임을 시작합니다.");
//        System.out.println(); // 게임 시작 메소드
//        System.out.println("다리 길이를 입력해주세요."); // 다리 길이 입력하는 메소드
//        return SCANNER.nextInt();
//    }
//
//    public static List<Integer> 다리상태(int bridgeLength) {
//        List<Integer> randomNumbers = new ArrayList<>();
//        for (int i = 0; i < bridgeLength; i++) {
//            randomNumbers.add(RANDOM.nextInt(2)); // 0 이면 아래, 1이면 위에
//        }
//        return randomNumbers;
//    }
//
//    public static boolean 게임시작단계() {
//        return false;
//    }
//
//    public static int 게임시도횟수(int count) {
//        return count + 1;
//    }
//
//    public static void 다리건너기시작(int bridgeLength) {
//        for (int i = 0; i < bridgeLength; i++) {
//            String move = 다리선택();
//            if (윗다리선택(move)) {
//                if (일이냐()) {
//                    upperList.add(" O ");
//                    lowerList.add("   ");
//                    upperOCount++;
//                }
//                if (일이아니냐()){
//                    upperList.add(" X ");
//                    lowerList.add("   ");
//                    failCount++;
//                }
//            }
//            if (아래다리선택(move)){
//                if (randomNumbers.get(i) == 0) {
//                    lowerList.add(" O ");
//                    upperList.add("   ");
//                    lowerOCount++;
//                } else {
//                    lowerList.add(" X ");
//                    upperList.add("   ");
//                    failCount++;
//                }
//            }
//            upperBridge.append(upperList.get(i)).append("]");
//            lowerBridge.append(lowerList.get(i)).append("]");
//            System.out.println(upperBridge);
//            System.out.println(lowerBridge);
//            if (failCount > 0) {
//                break;
//            } else {
//                upperBridge.deleteCharAt(upperBridge.length() - 1);
//                lowerBridge.deleteCharAt(lowerBridge.length() - 1);
//                upperBridge.append("|");
//                lowerBridge.append("|");
//            }
//            System.out.println();
//        }
//    }
//    public static String 다리선택() {
//        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
//        return SCANNER.next(); // 이동하고 싶은 위치 선택
//    }
//
//    public static boolean 윗다리선택(String move) {
//        return move.equals("U");
//    }
//
//    public static void 질문한다일이냐() {
//        if (일이냐()) {
//            upperList.add(" O ");
//            lowerList.add("   ");
//            upperOCount++;
//        }
//    }
//
//    public static void 질문한다일아아니냐() {
//        if (일이아니냐()){
//            upperList.add(" X ");
//            lowerList.add("   ");
//            failCount++;
//        }
//    }
//
//    public static boolean 일이냐() {
//        return randomNumbers.get(i) == 1;
//    }
//
//    public static boolean 일이아니냐() {
//        return randomNumbers.get(i) != 1;
//    }
//
//
//    public static boolean 아래다리선택(String move) {
//        return move.equals("D");
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
