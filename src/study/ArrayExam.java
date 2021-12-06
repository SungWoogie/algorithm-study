package study;

public class ArrayExam {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        int[] arr1 = new int[arr.length - 1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int num : arr1) {
            System.out.println(num);
        }

    }
}

