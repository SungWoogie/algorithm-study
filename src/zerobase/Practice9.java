package zerobase;

public class Practice9 {
    public static void solution(int[] arr) {
        int idx = 0;
        for (int num : arr) {
            if (idx == 0 || num > arr[idx - 1]) {
                arr[idx++] = num;
            }
        }
        System.out.print("[" + idx + "]");
        for (int i = 0; i < idx; i++) { // 단순히 출력
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        solution(new int[]{1, 1, 2});
        solution(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
