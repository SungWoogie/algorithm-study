package programmers;

public class Challenger_7 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 5};

        double returnArr = solution(arr);
        System.out.println(returnArr);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = sum / arr.length;
        return answer;
    }
}
