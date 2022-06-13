package programmers;

public class Pro_220613 {
    public static void main(String[] args) { // n 개의 최소 공배수
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));

    }

    public static int solution(int[] arr) {
        int answer = 0;
        int max = arr[0];

        for (int n : arr) {
            if (max < n) {
                max = n;
            }
        }

        int i = 1;
        while (true) {
            int temp = max * i;
            boolean pass = true;

            for (int j = 0; j < arr.length; j++) {
                if (temp % arr[j] != 0) {
                    pass = false;
                    break;
                }
            }
            i++;
            if (pass) {
                return temp;
            }
        }
    }
}
