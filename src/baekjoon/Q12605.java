package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q12605 { // 단어 순서 뒤집기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        String str = scanner.nextLine();

        for (int i = 1; i <= testCase; i++) {
            String[] strArr = scanner.nextLine().split(" ");
            Stack<String> stack = new Stack<>();

            for (String s : strArr) {
                stack.push(s);
            }

            System.out.print("Case #" + i + ": ");
            for (int j = 0; j < strArr.length; j++) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}
