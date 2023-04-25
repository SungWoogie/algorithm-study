package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_230425 {
    public static void main(String[] args) {

        // 기존
        String[] arr = {"a", "c", "b", "z", "e"};
        List<String> list = List.of(arr);

        // 스트림 생성
        Stream<String> arrStream = list.stream();
        Stream<String> listStream = Arrays.stream(arr);

        // 스트림 출력
        System.out.println("=== arrStream ===");
        arrStream.sorted().forEach(System.out::print);

        System.out.println();
        System.out.println("=== listStream ===");
        listStream.sorted().forEach(System.out::print);
    }
}
