package baekjoon;

import java.util.*;

public class Q11557 { // Yangjojang of The Year
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt(); // 테스트 케이스 입력

        for (int i = 0; i < testCase; i++) {
            int testCase2 = scanner.nextInt();
            Map<String, Integer> map = new HashMap<>(); // 두개의 값을 저장하기 위해 Map 활용

            int maxValue = 0; // 제일 큰 value 값을 저장하기 위한 변수 생성

            for (int j = 0; j < testCase2; j++) {
                map.put(scanner.next(), scanner.nextInt()); // 문자열과, 정수 저장
                maxValue = Collections.max(map.values()); // value 값을 가져와서 제일 큰 값 찾기
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) { // map 에 있는 값을 순회 하면서 기존에 저장한 값이랑
                if (entry.getValue().equals(maxValue)) { // 같은지 확인하고 같으면 key 값 가져와서 출력 후 break;
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}
