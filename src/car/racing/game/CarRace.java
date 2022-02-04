package car.racing.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carName = scanner.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();

        String[] car = carName.split(",");
        List<String> carList = new ArrayList<>(Arrays.asList(car));
        System.out.println("실행 결과");

//        List<String> stickCountList = new ArrayList<>();

        int[] arr = new int[carList.size()];
//        String str = "-";

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < carList.size(); j++) {
                int stick = (int) (Math.random() * 10);
                if (stick >= 4) {
                    arr[j]++;
                }
                System.out.println(carList.get(j) + " " + ":" + " " + arr[j]);
            }
            System.out.println();
        }
    }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[0] >= arr[1]) {
//                System.out.println("");
//            }
//
//        }
}

