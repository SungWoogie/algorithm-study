package study;

public class Test2_211129 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 20, 30, 20};
//        int[] post = Array(arr);
        int[] remove = remove(arr);

        for (int a : remove) {
            System.out.print(a + " ");
        }

//        for (int a : post) {
//            System.out.print(a + " ");
//        }
    }

//    public static int[] Array(int[] array) {
//        int[] returnArr = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            returnArr[array.length - i - 1] = array[i];
//        }
//        return returnArr;
//    }

    public static int[] remove(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                    arr[i] = 0;
                }
            }
        }

        int[] newArr = new int[arr.length - count];
        count = 0;
        for (int j : arr) {
            if (j != 0) {
                newArr[count] = j;
                count++;
            }
        }

        return newArr;
    }
}

