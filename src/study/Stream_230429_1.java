package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_230429_1 {
    public static void main(String[] args) {
        System.out.println("배열로부터 스트림 생성하기");
        Stream<String> stringStream = Stream.of("a", "b", "c"); // 가변인자
        stringStream.forEach(System.out::println);

        String[] strArr = new String[]{"22", "44", "33"};
        Stream<String> stream = Stream.of(strArr);
        stream.forEach(System.out::print);
        System.out.println();

        Stream<String> stream1 = Arrays.stream(strArr).sorted();
        stream1.forEach(System.out::print);
        System.out.println();

        Stream<String> stream2 = Arrays.stream(strArr, 1, 2);
        stream2.forEach(System.out::print);
        System.out.println();


    }

}
