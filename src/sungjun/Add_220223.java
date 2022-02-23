package sungjun;

import java.util.Scanner;
 // 무한 add 구현
public class Add_220223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5};

        while (true) {
            int n = scanner.nextInt();
            arr = solution(arr, n);
            for (int a : arr) {
                System.out.print(a + " ");
            }
        }
    }

    public static int[] solution(int[] arr, int n) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = n;
        return newArr;
    }
}
