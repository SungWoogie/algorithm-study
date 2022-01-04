//package baseballGame;
//
//import java.util.*;
//
//public class BaseballMethod {
//    public static Scanner SCANNER = new Scanner(System.in);
//    public static Set<Integer> TEMP_COMPUTER_NUMBER = new LinkedHashSet<>(); // 중복값 없애기 위한 Set 사용
//    public static List<Integer> USER_NUMBER = new ArrayList<>();
//    public static final int THREE_RANDOM_NUMBER = 3;
//    public static final int MAX_RANDOM_NUMBER = 9;
//    public static final int NUMBER_INTEGER_CHANGE = 1;
//
//    public static void main(String[] args) {
//
//        boolean replay = true; // 게임이 끝나고 재시작을 위한 불리언 생성
//
//        while (replay) {
//            boolean Continue = true; // 게임이 끝나고 재시작할 때 숫자 재생성을 위한 불리언 생성
//            randomNumber();
//
//            List<Integer> computerNumber = new ArrayList<>(TEMP_COMPUTER_NUMBER);
//
//            while (Continue) {
//                for (int a : computerNumber) {
//                    System.out.print(a + " ");
//                }
//                lineChange();
//                output("슷자를 입력해주세요.");
//                int strike = 0;
//                int ball = 0;
//
//                userNumberCreate(input());
//
//                if (strike == 0 && ball == 0) {
//                    System.out.println("낫싱");
//                }
//                if (strike > 0 && ball == 0) {
//                    System.out.println(strike + " " + "스트라이크");
//                } else if (strike == 0 && ball > 0) {
//                    System.out.println(ball + " " + "볼");
//                }
//                if (strike > 0 && ball > 0) {
//                    System.out.println(strike + " " + "스트라이크" + " " + ball + " " + "볼");
//                }
//                if (strike == 3) {
//                    output("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
//                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
//                    if (input() != 1) { // 게임을 다시 시작할지 끝낼지 여부 확인
//                        replay = false; // 1이 아니라면 위에 만들어준 replay = false 로 게임 끝
//                    } else { // 1이라면 게임을 다시시작
//                        TempComputerNumber.clear(); // 다시 시작하기전에 기존에 Set, List 에 있는 값 초기화
//                        computerNumber.clear();
//                    }
//                    Continue = false; // 1이라면 게임 다시 시작을 위하여 Continue = false 로 만들어 닫음, 와일 반복해서 진행하기 때문
//                }
//            }
//        }
//    }
//
//    public static int input() { // 입력하는 기능
//        return SCANNER.nextInt();
//    }
//
//    public static void numberOutput() { // 안내 멘트 출력
//        System.out.print("숫자를 입력해주세요 : ");
//    }
//
//    public static void output(String outputMsg) {
//        System.out.println(outputMsg);
//    }
//
//    public static void randomNumber() { // 중복 숫자 제거하는 기능
//        while (TEMP_COMPUTER_NUMBER.size() != THREE_RANDOM_NUMBER) { // 컴퓨터 숫자 생성
//            for (int i = 0; i < THREE_RANDOM_NUMBER; i++) {
//                TEMP_COMPUTER_NUMBER.add((int) (Math.random() * MAX_RANDOM_NUMBER) + NUMBER_INTEGER_CHANGE);
//            }
//        }
//    }
//
//    public static void lineChange() {
//        System.out.println();
//    }
//
//    public static void userNumberCreate() {
//
//        for (int i = 0; i < THREE_RANDOM_NUMBER; i++) {
//            userNumber.add(input());
//            if (computerNumber.contains(userNumber.get(i))) { // 컴퓨터 숫자에 유저 숫자가 있는지 확인
//                if (computerNumber.get(i).equals(userNumber.get(i))) {
//                    strike++;
//                } else {
//                    ball++;
//                }
//            }
//        }
//
//    }
//
//    //------------------------------------------------------
//    public static void 반복한다() { //숫자야구 작은버전;
//        while (true) {
//            컴퓨터숫자생성();
//
//            while (true) {
//                비교();
//            }
//        }
//    }
//
//    public static void 컴퓨터숫자생성() {
//        while (사이즈가 3일때까지 돈다) {
//            TEMP_COMPUTER_NUMBE
//        }
//    }
//
//    public static boolean 비교() {
//        if (true) {
//
//        }
//    }
//
//    public static void 값저장(boolean 볼값) {
//        if (볼값 == true) {
//            count++;
//        }
//    }
//
//    public static void 재시작() {
//
//    }
//
//    public static void is스트라이크() {
//        if (스트라이크 == 3) {
//            재시작();
//        } else {
//            돌아가();
//        }
//    }
//
//
//
//}
//
