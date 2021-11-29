package study;

public class Test2_211129 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 80, 7, 10, 7, 5, 20, 35, 70, 15, 10, 3};
        int[] post = Array(arr);

        for (int a : post) {
            System.out.print(a + " ");
        }
    }

    public static int[] Array(int[] array) {
        int[] returnArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            returnArr[array.length - i - 1] = array[i];
        }
        return returnArr;
    }
}
