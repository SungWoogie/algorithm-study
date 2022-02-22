package baekjoon;
// Q2587 성준이 응용 문제
import java.util.Arrays;
import java.util.Scanner;

public class Q2587_220222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n % 2 == 1) {
            int[] arr = new int[n];

            int sum = 0;
            int divide = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            Arrays.sort(arr);
            divide = arr[arr.length / 2];
            System.out.println(sum / arr.length);
            System.out.println(divide);
        } else {
            int[] arr1 = new int[n];

            int sum1 = 0;
            int divide1 = 0;
            int divide2 = 0;

            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = scanner.nextInt();
                sum1 += arr1[i];
            }
            Arrays.sort(arr1);
            divide1 = arr1[arr1.length / 2]; // 40
            divide2 = arr1[(arr1.length / 2) - 1];

            System.out.println(sum1 / arr1.length);
            System.out.println(divide1 + divide2);
        }
    }
}

