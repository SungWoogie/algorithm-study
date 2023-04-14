package zerobase;

import java.util.Scanner;

public class Practice3 {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 입력 : ");
        char input = scanner.nextLine().charAt(0);
        int output = 0;
        int temp = 'a' - 'A'; // 97 - 65
        System.out.println("temp : " + temp);
        if (input >= 'a' && input <= 'z') {
            output = (int) input - temp;
            System.out.println("대문자 변환 : " + (char) output);
        } else if (input >= 'A' && input <= 'Z') {
            output = (int) input + temp;
            System.out.println("소문자 변환 : " + (char) output);
        } else {
            System.out.println("알파벳이 아니다.");
        }
//        65 - 90 대문자
        /*
        0 = 48 을 기준으로 뺀다. -> D = 68
        68 - 48 = 20 ->
        입력받은 값이 대문자인지 소문자인지 먼저 확인해야 함
         */
//        if (alphabet.equals(alphabet.toLowerCase())) {  // 문자열이 소문자이면
//            return alphabet.toUpperCase();  // 대문자로 변환하여 반환
//        } else if (alphabet.equals(alphabet.toUpperCase())) {  // 문자열이 대문자이면
//            return alphabet.toLowerCase();  // 소문자로 변환하여 반환
//        } else {  // 문자열이 알파벳이 아니면
//            return alphabet;  // 그대로 반환
//        }

    }

    public static void main(String[] args) {
        solution();
        /*
        A
        B
        c
        d
         */
    }
}
