package test;

import java.util.LinkedList;
import java.util.List;

public class Test_230512 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>(); // int 타입으로 선언

        LinkedList<Integer> linkedList2 = new LinkedList<>(); // 타입 선언 생략도 가능

        // 초기 값 세팅
        LinkedList<Integer> linkedList3 = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        linkedList3.add(0, 10);
        System.out.println(linkedList3);

        linkedList3.remove(1);
        System.out.println(linkedList3);

        for (int a : linkedList3) {
            System.out.println(a);
        }

        // 앞에 List 인터페이스를 활용하여 생성
        List<Integer> linkedList4 = new LinkedList<>();


    }
}
