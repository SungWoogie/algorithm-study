package baekjoon;
// 22.02.10 못품
import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26];
        String str = scanner.next().toUpperCase();

        for (int i = 0; i < str.length(); i++) { // 몇개 나왔는지 체크
            int num = str.charAt(i) - 65; // 대문자 - 65
            arr[num]++;
        }
        int max = 0;
        char ch = '?';
        for (int i = 0; i < arr.length; i++) { // 누가 제일 많이 나왔는지 체크
            if (max < arr[i]) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (max == arr[i]) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
