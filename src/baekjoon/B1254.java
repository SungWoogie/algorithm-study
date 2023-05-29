package baekjoon;

import java.util.Scanner;

// S.2, 팰린드롬 만들기
public class B1254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int answer = str.length();

        // 주어진 문자열을 순회하며 팰린드롬인지 확인
        for (int i = 0; i < str.length(); i++) {
            if (isPalindrome(str.substring(i))) { // 팰린드롬이면 더 이상 탐색하지 않고 종료
                break;
            }
            answer++; // 팰린드롬이 아니면 문자열 길이를 증가시킴
        }
        System.out.println(answer);
    }

    // 주어진 문자열이 팰린드롬인지 확인하는 메서드
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // 양쪽에서부터 문자를 비교하여 팰린드롬인지 확인
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) { // 문자가 다르면 팰린드롬이 아님
                return false;
            }
            left++;
            right--;
        }
        // 모든 문자가 같다면 팰린드롬
        return true;
    }
}
