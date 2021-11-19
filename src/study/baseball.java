package study;
// 2021.11.17
import java.util.*;

public class baseball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        boolean replay = true;

        while (count < 1) { //여기로 돌아옴

            Set<Integer> computerNumber = new HashSet<>();

            if (replay) {
                while (computerNumber.size() != 3) {
                    computerNumber.add((int) (Math.random() * 9) + 1);
                }
            }
            replay = false;


            List<Integer> choice = new ArrayList<>(computerNumber);
            Iterator<Integer> iterator = choice.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }


            boolean numberOperator = false;
            while (!numberOperator) {

                System.out.println();
                System.out.print("숫자를 입력해주세요 : ");


                List<Integer> playerNumber = new ArrayList<>();

                int strike = 0;
                int ball = 0;

                for (int i = 0; i < 3; i++) {
                    playerNumber.add(scanner.nextInt());

                    if (choice.contains(playerNumber.get(i))) {
                        if (playerNumber.get(i).equals(choice.get(i))) {
                            strike++;
                        }
                        if (!playerNumber.get(i).equals(choice.get(i))) {
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
                } else if (ball > 0 && strike == 0) {
                    System.out.println(ball + " 볼");
                }
                if (strike != 3) {
                    numberOperator = true;
                }
                if (strike == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    int num = scanner.nextInt();

                    if (num == 1) {
                        count++;
                        replay = true;
                    } else if (num == 2) {
                        break;
                    }
                }
            }
        }
    }
}



