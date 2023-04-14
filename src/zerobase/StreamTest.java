package zerobase;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);


//        int intStream = Arrays.stream(arr).filter(num -> num % 2 == 0).sum();
//        System.out.println(intStream);

        System.out.println(Arrays.stream(arr).filter(num -> num % 2 == 0).sum());
    }
}
