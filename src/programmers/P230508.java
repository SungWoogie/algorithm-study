package programmers;

import java.util.Arrays;
import java.util.Stack;
// stack Lv1 - 같은 숫자는 싫어
public class P230508 {
    public static int[] solution(int[] arr) {
        int[] answer;

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[0]);
            }

            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            } else if (stack.peek() == arr[i]) {
                stack.pop();
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1}))); // 1 3 0 1
        System.out.println(Arrays.toString(solution(new int[]{4, 4, 4, 3, 3}))); // 4 3
    }
}
