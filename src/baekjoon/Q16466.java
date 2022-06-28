package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q16466 { // 콘서트
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < testCase; i++) { // 숫자 입력
            list.add(scanner.nextInt());
        }
        Collections.sort(list); // 작은 값 기준으로 출력하기 위해 오름차순으로 정렬
        int count = 0;
        for (int i = 0; i < testCase; i++) {
            if (list.get(i) != i + 1) { // list 0번째 부터 ~ i + 1 이 같을 때 까지 비교 (4 != 2 + 1 = 3) 같지 않음
                System.out.println(i + 1); // i + 1 해서 출력하고 count++
                count++;
                break;
            }
        }
        if (count == 0) { // count 가 0 이면 맨뒤 숫자 + 1 해서 출력
            System.out.println(testCase + 1);
        }
    }
}
