package test;

import java.util.*;

public class Memo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Integer> randomNumbers = new ArrayList<>(); // 길이 3의 랜덤 숫자 생성
        for (int i = 0; i < 3; i++) {
            randomNumbers.add(random.nextInt(2));
        }

        // 괄호를 짝대기로 만들려면
        // 1. 스트링빌더 사용

        List<String> upperBridges = new ArrayList<>();
        List<String> lowerBridges = new ArrayList<>();
        Map<String, List<String>> bridges = new LinkedHashMap<>();


        // 위에 다리 O,X 만들기
        for (int randomNumber : randomNumbers) { // 값 하나씩 꺼내서 위에 다리와, 아래 다리 가능 여부 리스트 저장하기
            if (randomNumber == 1) { // 1이면 위에 다리 건널 수 있으므로 O
                upperBridges.add("O");
            }
            if (randomNumber == 0) {
                upperBridges.add("X");
            }
        }
        // 아래 다리 O,X 만들기
        for (String upperBridge : upperBridges) {
            if (upperBridge.equals("X")) {
                lowerBridges.add("O");
            }
            if (upperBridge.equals("O")) {
                lowerBridges.add("X");
            }
        }
        System.out.println(upperBridges);
        System.out.println(lowerBridges);
        bridges.put("U", upperBridges);
        bridges.put("D", lowerBridges);

        StringBuilder upperBuilder = new StringBuilder("[ ");
        StringBuilder lowerBuilder = new StringBuilder("[ ");


        int totalCount = 0;
        int successCount = 0;


        for (int i = 0; i < 3; i++) {

            String select = scanner.next();
            List<String> upper = bridges.get("U"); // 위에 다리
            List<String> lower = bridges.get("D"); // 아래 다리

            if (select.equals("U")) { // 입력한 값이 U 일 경우
                if (upper.get(i).equals("O")) { // 0번쨰 값이 O 이냐 그러면 빌더에 저장하고 lower 는 공백 저장
                    upperBuilder.append("O").append(" ]");
                    lowerBuilder.append(" ").append(" ]");
                    successCount++; // 맞을 경우 ++
                }
                if (upper.get(i).equals("X")) { // 틀렸을 경우
                    upperBuilder.append("X").append(" ]");
                    lowerBuilder.append(" ").append(" ]");
                }
            }
            if (select.equals("D")) { // D 일 경우
                if (lower.get(i).equals("O")) { // 밑에 입력한 값이 맞을 경우
                    lowerBuilder.append("O").append(" ]");
                    upperBuilder.append(" ").append(" ]");
                    successCount++; // 맞을 경우 ++
                }
                if (lower.get(i).equals("X")) { // 틀릴 경우
                    lowerBuilder.append("X").append(" ]"); // X 넣고
                    upperBuilder.append(" ").append(" ]"); // 공백 넣고
                }
            }
            System.out.println(upperBuilder);
            System.out.println(lowerBuilder);

            upperBuilder.delete(upperBuilder.length() - 1, upperBuilder.length());
            lowerBuilder.delete(lowerBuilder.length() - 1, lowerBuilder.length());
            upperBuilder.insert(upperBuilder.length(), "| ");
            lowerBuilder.insert(lowerBuilder.length(), "| ");
        }

    }
}
