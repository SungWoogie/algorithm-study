package sungjun;

public class ValueRemove_1_211208 { // 중복 x
    public static void main(String[] args) {
        int index = 50;
        int[] arr = new int[]{20, 10, 50, 100, 30};
        int[] remove = remove(arr, index);

        for (int a : remove) {
            System.out.print(a + " ");
        }
    }

    public static int[] remove(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != index) {
                newArr[count] = arr[i];
                count++;
            }
        }
        return newArr;
    }
}
