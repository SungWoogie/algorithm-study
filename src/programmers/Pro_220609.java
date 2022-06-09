package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Pro_220609 {
    public static void main(String[] args) {
        // 도움 코드
        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(solution(prices)));
        System.out.println(Arrays.toString(solution1(prices)));
    }

    public static int[] solution(int[] price) { // 이중 for 문 활용
        int[] answer = new int[price.length];

        for (int i = 0; i < price.length; i++) {
            for (int j = i + 1; j < price.length; j++) {
                answer[i]++;
                if (price[i] > price[j]) {
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] solution1(int[] price) { // stack 활용
        int[] answer1 = new int[price.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < price.length; i++) {
            while (!stack.isEmpty() && price[i] < price[stack.peek()]) {
                answer1[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer1[stack.peek()] = price.length - stack.peek() - 1;
            stack.pop();
        }
        return answer1;
    }
}
