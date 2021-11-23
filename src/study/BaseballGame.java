package study;

import java.util.*;

public class BaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean replay = true;
        boolean reNumber = true;

        Set<Integer> set = new LinkedHashSet<>();
        while (replay) {
            if (reNumber) {
                while (set.size() != 3) {
                    set.add((int) (Math.random() * 9) + 1);
                }
            }
            reNumber = false;
            List<Integer> cList = new ArrayList<>(set);

            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
            System.out.print("숫자를 입력해주세요 : ");

            List<Integer> uList = new ArrayList<>();

            int strike = 0;
            int ball = 0;
            for (int i = 0; i < 3; i++) {
                uList.add(scanner.nextInt());

                if (cList.contains(uList.get(i))) {
                    if (cList.get(i).equals(uList.get(i))) {
                        strike++;
                    } else if (!cList.get(i).equals(uList.get(i))) {
                        ball++;
                    }
                }
            }

            if (strike > 0 && ball > 0) {
                System.out.println(strike + " 스트라이크" + " " + ball + " 볼");
            } else if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            }
            if (strike > 0 && ball == 0) {
                System.out.println(strike + " 스트라이크");
            } else if (strike == 0 && ball > 0) {
                System.out.println(ball + " 볼");
            }
            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

                int num = scanner.nextInt();
                if (num != 1) {
                    replay = false;
                } else {
                    set.clear();
                    reNumber = true;
                }
            }
        }
    }
}


