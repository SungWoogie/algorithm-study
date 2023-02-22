package test;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        List<Integer> list = List.of(24, 1, 5, 7, 6);
//
//        List<Integer> intStream = list.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        intStream.forEach(System.out::println);


        Stream<Integer> integerStream = Stream.iterate(1, x -> x + 2);
        integerStream.limit(10)
                .forEach(System.out::println);

    }
}
