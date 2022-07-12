package programmers;

public class Lv1_Kakao_220712 { // 키패드 누르기
    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(solution(numbers, hand));

    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right = numbers[i];
            } else {
                if (numbers[i] == 0) {
                    numbers[i] = 11;
                }
                int leftNumber = (Math.abs(numbers[i] - left) / 3) + (Math.abs(numbers[i] - left) % 3);
                int rightNumber = (Math.abs(numbers[i] - right) / 3) + (Math.abs(numbers[i] - right) % 3);

                if (leftNumber > rightNumber) {
                    sb.append("R");
                    right = numbers[i];
                } else if (leftNumber < rightNumber) {
                    sb.append("L");
                    left = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        sb.append("R");
                        right = numbers[i];
                    } else {
                        sb.append("L");
                        left = numbers[i];
                    }
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}
