package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            list.add(scanner.nextInt());
            sum += list.get(i); // 난쟁이 키 총 합
        }
        Collections.sort(list); // 정렬

        for (int i = 0; i < list.size(); i++) { // 브루트포스 나올 수 있는 모든 경우의 수를 탐색
            for (int j = i + 1; j < list.size(); j++) {

                if (sum - list.get(i) - list.get(j) == 100) {
                    for (int k = 0; k < list.size(); k++) {
                        if (i == k || j == k) {
                            continue;
                        }
                        System.out.println(list.get(k));
                    }
                }
            }
        }
    }
}
