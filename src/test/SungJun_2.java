package test;

public class SungJun_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] num = number(arr);


    }

    public static int[] number(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] * -1;
        }
        for (int a : newArray) {
            System.out.println(a);
        }

        return newArray;
    }
}

