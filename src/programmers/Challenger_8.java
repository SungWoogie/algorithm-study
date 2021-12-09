package programmers;

// 없는 숫자 더하기 2021.12.09
public class Challenger_8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        int result = solution(arr);
        System.out.println(result);

    }

    public static int solution(int[] numbers) {

        int num = 45;

        for (int i = 0; i < numbers.length; i++) {
            num -= numbers[i];
        }
        return num;
    }
}
