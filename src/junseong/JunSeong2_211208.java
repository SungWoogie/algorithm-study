package junseong;

public class JunSeong2_211208 {
    public static void main(String[] args) {
        int num = 1;
        int[] arr = new int[]{1, 2, 4, 8, 10};
        int[] result = asd(num, arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] asd(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        return arr;
    }
}
