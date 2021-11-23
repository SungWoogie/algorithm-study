package test;

import java.util.Scanner;

public class Memo {
    public static void main(String[] args) {
        //여기는 실행구간
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; //초기값 지정

        나는출력(arr); //이게 맞는거지
        나는배열을뒤집어(arr);//이렇게 하면 의미가 없음
        int[] arr123 = 나는배열을뒤집어(arr); //이런식으로 저장을해줌
        //나는배열을뒤집어(arr) 이 메소드 호출자체가 리턴하는 배열이랑 같은거임
        //나는배열을뒤집어(arr) == arr //뒤집어진 배열과 같다 //생긴건 메소드 호출이지만
        //결국 리턴하는 값이랑 같다
        for (int i : 나는배열을뒤집어(arr)) {
            System.out.println(i); //이렇게도 댐
        }
        나는배열을뒤집고출력까지할래(arr); //이렇게 3개의 메소드가 있음 //이렇게써도 상관없다~

        //값을 넣어줬을때 다 다른게 실행함


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a;
        b = a;
        a = b;

    }

    public static void 나는출력(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        //얘는 배열을 받아서 출력만 하는용도 메소드
    }

    public static int[] 나는배열을뒤집어(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //뒤집었음
        }
        return arr;
    }

    public static void 나는배열을뒤집고출력까지할래(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //뒤집는중
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
