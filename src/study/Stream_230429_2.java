package study;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_230429_2 {
    public static void main(String[] args) {
        System.out.println("난수를 갖는 스트림 생성하기");
//        IntStream intStream = new Random().ints(); // 무한스트림
//        intStream.forEach(System.out::println);

        IntStream intStream1 = new Random().ints(5);
        intStream1.forEach(System.out::println);

        IntStream intStream2 = new Random().ints(3,5, 10);
        intStream2.forEach(System.out::println);
    }

}
