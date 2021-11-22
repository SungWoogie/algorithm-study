package study;

import java.util.Arrays;
import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {


            int[] arr = new int[10];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
                count++;
            }



            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                int[] arr123123 = new int[arr.length + 1];
                if (count == arr.length) {
                    for (int i = 0; i < arr.length; i++) {
                        arr123123[i] = arr[i];
                    }
                    arr123123[arr.length] = num;
                    System.out.println(Arrays.toString(arr123123));
                }
            }

        }
    }
}
