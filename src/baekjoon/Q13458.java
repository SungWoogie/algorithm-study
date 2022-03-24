package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13458 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); // 시험장에 있는 응시자 수 넣기 위한 리스트

        int classRoom = scanner.nextInt(); // 시험장 갯수

        for (int i = 0; i < classRoom; i++) { // 시험장 응시자 입력
            list.add(scanner.nextInt());
        }

        int firstJudge = scanner.nextInt(); // 총 감독관 수
        int secondJudge = scanner.nextInt(); // 부 감독관 수

        long count = 0;
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > firstJudge) {
                arr[i] = list.get(i) - firstJudge;
            }
            count++;

            int divide = arr[i] / secondJudge; // 0
            int percent = arr[i] % secondJudge; // 1

            if (percent > 0) {
                divide++;
            }
            count += divide;
        }
        System.out.println(count);
    }
}
