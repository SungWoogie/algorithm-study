package study;
// 2021.11.25 배열 역방향
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] arr1 = new int[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr1[i] = arr[arr.length - i - 1];
            System.out.print(arr1[i] + " ");
        }
    }
}
