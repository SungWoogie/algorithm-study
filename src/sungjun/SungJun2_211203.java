package sungjun;

public class SungJun2_211203 {
    public static void main(String[] args) {
        int index = 4;
        int num = 90;
        int[] arr = new int[]{20, 30, 40, 50, 60};
        int[] returnArr = indexAdd(arr, index, num);

        for (int a : returnArr){
            System.out.print(a + " ");
        }
    }

    public static int[] indexAdd(int[] arr, int index, int num) {
        int[] returnArr = new int[arr.length + 1];

        int count = 0;

        for (int i = 0; i < returnArr.length; i++) {
            if (index == i) {
                returnArr[index] = num;
            } else {
                returnArr[i] = arr[count];
                count++;
            }
        }
        return returnArr;
    }
}
