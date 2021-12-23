package baseballGame;

import java.util.*;

public class Baseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean replay = true; // 게임이 끝나고 재시작을 위한 불리언 생성

        while (replay) {
            boolean Continue = true; // 게임이 끝나고 재시작할 때 숫자 재생성을 위한 불리언 생성
            Set<Integer> TempComputerNumber = new LinkedHashSet<>(); // 중복값 없애기 위한 Set 사용
            while (TempComputerNumber.size() != 3) { // 컴퓨터 숫자 생성
                for (int i = 0; i < 3; i++) {
                    TempComputerNumber.add((int) (Math.random() * 9) + 1);
                }
            }
            List<Integer> computerNumber = new ArrayList<>(TempComputerNumber); // set 값 가져오기 위해 List 로 변환

            while (Continue) {
                for (int a : computerNumber) {
                    System.out.print(a + " ");
                }
                System.out.println();
                System.out.print("숫자를 입력해주세요 : ");

                int strike = 0;
                int ball = 0;

                List<Integer> userNumber = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    userNumber.add(scanner.nextInt());
                    if (computerNumber.contains(userNumber.get(i))) { // 컴퓨터 숫자에 유저 숫자가 있는지 확인
                        if (computerNumber.get(i).equals(userNumber.get(i))) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
                if (strike == 0 && ball == 0) {
                    System.out.println("낫싱");
                }
                if (strike > 0 && ball == 0) {
                    System.out.println(strike + " " + "스트라이크");
                } else if (strike == 0 && ball > 0) {
                    System.out.println(ball + " " + "볼");
                }
                if (strike > 0 && ball > 0) {
                    System.out.println(strike + " " + "스트라이크" + " " + ball + " " + "볼");
                }
                if (strike == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    if (scanner.nextInt() != 1) {
                        replay = false;
                    } else {
                        TempComputerNumber.clear();
                        computerNumber.clear();
                    }
                    Continue = false;
                }
            }
        }
    }
}