package study;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_230429_3 {
    public static void main(String[] args) {
        System.out.println("스트림 요소 걸러내기");
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 2, 1, 21, 6);
        stream.distinct().forEach(System.out::println);

        System.out.println("========");
        IntStream stream1 = IntStream.rangeClosed(1, 10);
        stream1.filter(x -> x % 2 == 0).forEach(System.out::println);
    }

}
