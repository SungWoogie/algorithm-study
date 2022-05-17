package projectpractice;

import java.util.*;

public class CarRacingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");
        String[] car = scanner.nextLine().split(",");
        System.out.println("시도할 회수는 몇회 인가요?");
        int repeatNumber = scanner.nextInt();
        System.out.println("실행 결과");

        int[] positionArr = new int[car.length];   // 인덱스로 포지션 저장

        for (int i = 0; i < repeatNumber; i++) {                // 총 5번 반복
            for (int j = 0; j < car.length; j++) {           // cars 사이즈 만큼 반복
                int position = (int) (Math.random() * 10);   // 0-9까지 랜덤 숫자 생성
                if (position >= 4) {
                    positionArr[j]++;
                }
                System.out.print(car[j] + " : ");
                for (int k = 0; k < positionArr[j]; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 이름 포지션 결과 출력
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < car.length; j++) {
                System.out.print(car[j] + " : ");
                for (int k = 0; k < positionArr[j]; k++) {
                    System.out.print("-");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 우승자 출력 (제일 오래 걸리는중 )
        int max = 0;
        for (int j : positionArr) {     // 최대값 구하기
            max = Math.max(j, max);
        }

        // 수정 코드
        StringBuilder sb = new StringBuilder(); // 결과값 출력할 때 이름 붙이기 위한 빌더 생성
        for (int i = 0; i < positionArr.length; i++) {
            if (max == positionArr[i]) {
                sb.append(car[i]).append(" ");
            }
        }
        System.out.println(sb.append("가 최종 우승했습니다."));
    }
}