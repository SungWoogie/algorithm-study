package zerobase;

public class PreCodingTest_230517_5 {
    public static int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = Math.min(arr[i], answer);
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 2, 1, 3}));
    }

}
