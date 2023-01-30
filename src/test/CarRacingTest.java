package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRacingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<String> list = List.of("tjddnr");

        for (String name : list) {
            sb.append(name).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb + "가 우승했습니다.");
    }
}
