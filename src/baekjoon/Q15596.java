package baekjoon;

public class Q15596 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(sum(arr));

    }

    public static long sum(int[] a) {
        long sum = 0;
        for (int j : a) {
            sum += j;
        }

        return sum;
    }
}
