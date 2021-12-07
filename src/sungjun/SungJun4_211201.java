package sungjun;

public class SungJun4_211201 {
    public static void main(String[] args) {
        int index = 1;
        int[] arr = new int[]{10, 20, 30, 40, 50, 20};
        int[] remove = remove(arr, index);

        for (int a : remove) {
            System.out.print(a + " ");
        }
    }

    public static int[] remove(int[] arr, int index) {
        int[] returnArr = new int[arr.length - 1];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                returnArr[count] = arr[i];
                count++;
            }
        }
        return returnArr;
    }
}
