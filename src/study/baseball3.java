package study;
// 2021.11.19
import java.util.*;

public class baseball3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean replay = true;
        boolean operator = true;

        Set<Integer> set = new LinkedHashSet<>();
        while (replay) {

            if (operator) {
                while (set.size() != 3) {
                    set.add((int) (Math.random() * 9) + 1);
                }
            }
            operator = false;
            List<Integer> copy = new ArrayList<>(set);

            Iterator<Integer> iterator = copy.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }

            System.out.println();
            System.out.print("숫자를 입력하세요 : ");

            List<Integer> user = new ArrayList<>();
            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 3; i++) {
                user.add(scanner.nextInt());

                if (copy.contains(user.get(i))) {
                    if (copy.get(i).equals(user.get(i))) {
                        strike++;
                    }
                    if (!copy.get(i).equals(user.get(i))) {
                        ball++;
                    }
                }
            }
            if (strike > 0 && ball > 0) {
                System.out.println(strike + " 스트라이크" + " " + ball + " 볼");
            }
            if (strike > 0 && ball == 0) {
                System.out.println(strike + "스트라이크");
            } else if (strike == 0 && ball > 0) {
                System.out.println(ball + "볼");
            }
            if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            }
            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int num = scanner.nextInt();

                if (num != 1) {
                    replay = false;
                } else {
                    set.clear();
                    operator = true;
                }
            }
        }
    }
}