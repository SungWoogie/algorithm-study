package test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_230413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[]{"d", "b", "c", "a", "z"};

//        Stream<String> stream1 = Arrays.stream(arr);
//        stream1.forEach(System.out::println);

        Stream<String> stream = Arrays.stream(arr).sorted();
        stream.forEach(s -> System.out.print(s + " "));

//        stream.forEach(System.out::println);

        // 컬렉션 스트림
        List<Integer> list = new ArrayList<>(List.of(1, 2, 5, 7, 3));
        Stream<Integer> integerStream = list.stream();
        integerStream.forEach(System.out::println);

        // 스트림 빌더
        System.out.println("===스트림 빌더===");
        Stream<Object> stream1 = Stream.builder()
                .add("1")
                .add("z")
                .add("3")
                .build();
        stream1.forEach(System.out::println);

        // 스트림 제너레이터
        System.out.println("===스트림 제너레이터===");
        Stream<String> stream2 = Stream.generate(() -> "123").limit(4);
        stream2.forEach(System.out::println);

        // 이터레이트
        System.out.println("===스트림 이터레이트===");
        Stream<Integer> stream3 = Stream.iterate(10, num -> num * 2)
                .limit(4);
        stream3.forEach(System.out::println);

        // 기본타입 스트림
        System.out.println("===스트림 기본타입===");
        IntStream intStream = IntStream.range(2, 8);
        intStream.forEach(System.out::println);

        // 필터링
        System.out.println("===스트림 필터링===");
        IntStream stream4 = IntStream.range(1, 15)
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 10);
        stream4.forEach(System.out::println); // 조건에 맞는 애들을 걸러주는 용도

        // 매핑
        System.out.println("===스트림 매핑===");
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> mappedNumbers = numbers.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(mappedNumbers); // Output: [1, 2, 3, 4, 5]

        System.out.println("=== 증가 하는 숫자===");
        IntStream stream5 = IntStream.range(2, 5) // 각각의 원소들을 조건대로 다시 만들어주는 기능
                .map(num -> num + 1);
        stream5.forEach(System.out::println);

    }
}
