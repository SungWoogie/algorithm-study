package junseong;

public class JunSeong1_211208 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int[] arr = new int[]{3, 2, 1, 9, 5, 3, 1};
        int[] result = removeV3(a, b, arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeV3(int a, int b, int[] arr) {
        // 1
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == a) || (arr[i] == b)) {
                arr[i] = -1;
                count++;
            }
        }
        // 2
        int[] newArr = new int[count + 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

}
