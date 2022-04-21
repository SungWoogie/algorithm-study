package programmers;

import java.util.Arrays;

public class Pro_220421 {
    public static void main(String[] args) {
        long num = 12345;
        System.out.println(Arrays.toString(solution(num)));

    }

    public static int[] solution(long n) {
        String str = String.valueOf(n); // 배열에 크기를 지정해 주기 위해 String 형변환
        int[] answer = new int[str.length()]; // 길이 만큼 크기 지정

        long count = 0; // 인덱스 위치 바꾸기 위해 count

        while (n > 0) {
            answer[(int) count] = (int) (n % 10); // int 배열이므로 형변환 하여 값 저장
            n /= 10;
            count++;
        }
        return answer;
    }
}
