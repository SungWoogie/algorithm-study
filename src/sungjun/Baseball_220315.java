package sungjun;

import java.util.*;

public class Baseball_220315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean 게임다시 = true;
        while (게임다시) {
            Set<Integer> computerTempNumber = new LinkedHashSet<>();
            while (computerTempNumber.size() != 3) { // 컴퓨터 숫자 만들기
                computerTempNumber.add((int) (Math.random() * 9) + 1);
            }
            for (int a : computerTempNumber) {
                System.out.print(a + " ");
            }
            System.out.println();

            List<Integer> computerNumber = new ArrayList<>(computerTempNumber); // get 메소드 사용하기 위해서 list 에 담기

            boolean 숫자다시생성 = true;
            while (숫자다시생성) {
                System.out.print("숫자를 입력해주세요 : ");
                int strike = 0;
                int ball = 0;

                List<Integer> userNumber = new ArrayList<>();
                for (int i = 0; i < 3; i++) { // 사람 숫자 만들기
                    userNumber.add(scanner.nextInt());
                    if (computerNumber.contains(userNumber.get(i))) { // 스트라이크, 볼 여부 확인
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
                    System.out.println(strike + " 스트라이크");
                } else if (strike == 0 && ball > 0) {
                    System.out.println(ball + " 볼");
                }
                if (strike > 0 && ball > 0) {
                    System.out.println(strike + " 스트라이크" + " " + ball + " 볼");
                }
                if (strike == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
                    if (scanner.nextInt() == 1) {
                        computerTempNumber.clear();
                        computerNumber.clear();
                    } else {
                        게임다시 = false;
                    }
                    숫자다시생성 = false;
                }
            }
        }
    }
}