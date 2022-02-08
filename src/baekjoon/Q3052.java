package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < 10; i++) { // 42로 퍼센트한 값 추가 포문
            list.add(scanner.nextInt() % 42);
        }
        for (int i = 0; i < list.size(); i++) { // 값이 같은지 확인하는 포문
            int tmp = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    tmp++;
                }
            }
            if (tmp == 0) { // 위에 확인한 값을 가지고 0이 몇개 인지 확인 하는 조건
                count++;
            }
        }
        System.out.println(count);
    }
}