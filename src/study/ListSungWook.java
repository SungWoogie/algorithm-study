package study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListSungWook {

    public int[] array;
    public String name;

    public ListSungWook() {
        this.array = new int[0];
    }

    public ListSungWook(String str) {
        this.name = str;
    }

    public void add(int num) { // 크기1개 늘리고 마지막 인덱스에 값을 넣어준다.

        int[] newArray = new int[array.length + 1]; // 내가 가지고있는 (인스턴스 배열) 보다 1칸 많은 배열을 새로 만듬
        for (int i = 0; i < array.length; i++) { // 인스턴스 배열에 첫번째 값 기억하는 포문
            newArray[i] = this.array[i];
        }
        newArray[newArray.length - 1] = num; // 새로만든 배열에 마지막 값 num 을 입력
        this.array = newArray; // 배열을 재지정
        print();

    }

    public void indexAdd(int index, int num) {
        int[] newArray = new int[array.length + 1]; // 인덱스 1칸 추가 하는 배열
        int count = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (index == i) {
                newArray[index] = num;
                count++;
            } else {
                newArray[i] = this.array[i - count];
            }
        }
        this.array = newArray;
    }

    public void remove(int index) { // 파라미터로 받은 index 에 있는 값을 없앤다. 크기가 1개 줄어야함. //인덱스 입력시 인덱스 해당값 삭제기능

        int[] newArray = new int[array.length - 1]; // 내가 만든 인스턴스 배열 보다 1칸 적은 배열을 newArray 에 새로 만든다.
        int count = 0;// 조건의 값을 빼기 위한 변수 생성
        for (int i = 0; i < array.length; i++) { // 기존의 인스턴스 배열의 길이만큼 도는 포문을 만든다.
            if (index != i) { // 인덱스와 i가 같지 않을 때만 값을 추가한다.
                newArray[count] = this.array[i];
                count++; // 값이 같지 않다면 카운터++ 를 해준다
            }
        }
        this.array = newArray; // newArray 값을 this.array (인스턴스 배열) 로 지정한다.
        print();
    }

    public boolean contains(int num) { // 파라미터로 받은 NUM 과 일치하는 숫자가 있는지 여부를 리턴한다.
        int count = 0;
        for (int j : array) {
            if (j == num) {
                count++;
            }
        }
        return count >= 1;
    }

    public void print() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {
        ListSungWook sungWook = new ListSungWook();
        ListSungWook sungWook1 = new ListSungWook();
        ListSungWook sungWook2 = new ListSungWook("성준");
        System.out.println(sungWook.name);

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        int i = 0;
        while (i < 5) {
            sungWook.indexAdd(scanner.nextInt(), scanner.nextInt());
            sungWook.print();
            i++;
        }
        if (sungWook.contains(scanner.nextInt())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

//        while (true) {
//            sungWook.add(scanner.nextInt()); // scanner.nextInt == 0 1 2 3 4 5 6 7 8 9 10 20 30
//            if (sungWook.array.length == 5) {
//                sungWook.print();
//                break;
//            }

//        }
//        while (true) {
//            sungWook.remove(scanner.nextInt());
//            if (sungWook.array.length == 1) {
//                break;
//            }
//        }

}

