package sungjun;

public class ValueRemoveOverlap_1_211208 {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 100, 100, 100, 20};
        int num = 20;
        int[] returnArr = valueRemove(arr, num);

        for (int a : returnArr) {
            System.out.print(a + " ");
        }
    }

    public static int[] valueRemove(int[] arr, int num) {
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[count] = arr[i];
                count++;
            }
        }
        int[] returnArr = new int[count];
        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i] = newArr[i];
        }
        return returnArr;
    }
}