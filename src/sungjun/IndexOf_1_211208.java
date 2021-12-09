package sungjun;

public class IndexOf_1_211208 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 30, 40, 50, 10};
        int num = 30;
        int indexOf = indexOf(arr, num);

        System.out.println(indexOf);

        int[] arr1 = new int[]{50, 10, 10, 10, 20, 70, 20, 30, 50, 70}; // 10 10 20 30 40 50 50 60 50
        int[] number = {50, 70}; // 0 5 8 9

        for (int i : indexOf2(arr1, number)) {
            System.out.print(i + " ");
        }
    }

    public static int indexOf(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int[] indexOf2(int[] arr, int[] number) { //이거 고치기
        int[] newArr = new int[arr.length];
        int count = 0;
        // 10, 10, 30, 40, 50, 50
        // 10, 50

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (arr[i] == number[j]) {
                    newArr[count] = i;
                    count++;
                }
            }
        }
        int[] returnArr = new int[count];
        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i] = newArr[i];
        }

        return returnArr;
    }
}
