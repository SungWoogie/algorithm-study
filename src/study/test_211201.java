package study;

public class test_211201 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 21, 31, 41, 51};

        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
