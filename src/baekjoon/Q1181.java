package baekjoon;

import java.util.*;
// 길이가 짧은 순으로 정렬
// 길이가 같으면 사전순으로 a b c d e f g h i j k l m n o p q r s t u v w x y z
// 앞에 글자가 같이면 뒤에 글자 누가더 먼저 인지
// 중복 이면 값 하나로 만들기
// 길이가 같으면 먼저 입력한 값이 우선 순위

public class Q1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }
        list.sort((o1, o2) -> { // 람다식으로 표현 가능
            if (o1.length() == o2.length()) { // 문자열 길이가 같다면 사전순으로 정렬
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        System.out.println(list.get(0));
        for (int i = 1; i < n; i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                System.out.println(list.get(i));
            }
        }
    }
}
