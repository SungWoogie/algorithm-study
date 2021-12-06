package sungjun;

public class SungJun1_211203 {
    public static void main(String[] args) {
        int num = 1000;
        int[] arr = new int[]{20, 30, 40, 50, 70};
        int[] returnArr = add(arr, num);

        for (int a : returnArr) {
            System.out.print(a + " ");
        }
    }

    public static int[] add(int[] arr, int num) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = num;

        return newArr;
    }
}
