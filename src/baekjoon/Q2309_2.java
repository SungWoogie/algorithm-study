package baekjoon;

import java.util.*;

public class Q2309_2 { // 일곱 난쟁
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) { // 리스트에 값 입력하는 반복문
            list.add(scanner.nextInt()); // 값 입력
            sum += list.get(i); // 입력한 값 모두 더하기 (밑에서 빼주기 위함)
        }
        Collections.sort(list); // 출력에 정렬하여 출력하기에 미리 정렬

        int[] arr = new int[2]; // 값 두개 저장해 놓을 배열 생성

        for (int i = 0; i < list.size(); i++) { // 값 찾는 반복문
            for (int j = i + 1; j < list.size(); j++) {
                if ((sum - list.get(i)) - list.get(j) == 100) { // 총합 - i 번째 - j 번째가 100이랑 같은지 확인
                    arr[0] = list.get(i); // 같을 때 값 저장하고 break
                    arr[1] = list.get(j);
                    break;
                }
            }
        }
        for (int a : list) { // 처음부터 끝까지 전부 출력을 위해 향상된 반복문 활용
            if (arr[0] == a || arr[1] == a) { // 저장한 값이랑 같으면 넘어가고 그렇지 않으면 출력
                continue;
            }
            System.out.println(a);
        }
    }
}
