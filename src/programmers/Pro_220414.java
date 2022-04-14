package programmers;

public class Pro_220414 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(solution(arr));

    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int j : arr) {
            sum += j;
        }

        answer = sum / arr.length;

        return answer;
    }
}
