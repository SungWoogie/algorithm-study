package study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_230429 {
    public static void main(String[] args) {
        // 스트림을 생성하여 문자열 길이의 합을 계산 하는 코드
        Stream<String> stream = Stream.of("dd", "aaa", "CC", "cc", "b");
        int sum = stream.parallel()
                .mapToInt(String::length)
                .sum();
        System.out.println("문자열 길이 합 : " + sum);

        List<Integer> list = List.of(3, 2, 1, 6, 2);
        Stream<Integer> intStream = list.stream();
        System.out.println("리스트 스트림 변환 후 출력 : ");
        intStream.forEach(System.out::println);

        System.out.println("리스트 스트림 변환 후 출력2 : ");
        intStream = list.stream().sorted();
        intStream.forEach(System.out::print);
    }

}
