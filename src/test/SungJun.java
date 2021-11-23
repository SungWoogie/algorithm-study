package test;

public class SungJun {
    public static void main(String[] args) {
        int[] arr123 = new int[]{1, 2, 3, 4, 5};

        int[] arr1 = reverse(arr123); //여기서 arr123을 돌려버리고 니가 만든 2번째에 5 4 3 2 1 로가서 다시 1 2 3 4 5 로 돌아오네
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arr123) {
            System.out.println(i);
        }

        int[] arr2 = newReverse(arr123);
        for (int a : arr2) {
            System.out.print(a + " ");
        }
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] newReverse(int[] array1) {
        int[] arr = new int[5];
        for (int i = 0; i < array1.length; i++) {
            arr[i] = array1[arr.length - i - 1];
        }
        return arr;
    }
}
