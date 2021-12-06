package test;

import java.util.Scanner;

public class JunSeong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 22, 34, 24, 15, 66, 87, 38, 19, 20};

//        while (true) { // add 실행문
//            int num = scanner.nextInt();
//            arr = add(arr, num);
//            print(arr);
//        }
        while (true) { // indexAdd 실행문
            int index = scanner.nextInt();
            int num = scanner.nextInt();
            arr = indexAdd(arr, index, num);
            print(arr);
        }
    }


    public static int[] add(int[] arr, int num) {
        int[] array = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
        array[array.length - 1] = num;
        arr = array;

        return arr;
    }

    public static int[] indexAdd(int[] arr, int index, int num) {
        int[] newArray = new int[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i]; // 구 배열을, 뉴 배열에 값 옮기기
            if (newArray[i] != newArray[index])
                count++;{
            }
        }
        //쥰로직
        count = 0;
        for (int i = 0; i < newArray.length; i++) { //arr3개 값을 가지고있다 10 20 30
            if (i == index) {
                newArray[i] = num; //값 1개 추가       총newarr에 값을 4개 추가해줘야함
            } else {
                newArray[i] = arr[count];
                count++;
            }
        }
        //끝


        newArray[count] = num;
        arr = newArray;
        return arr;
    }

    public static void print(int[] arr1) {
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }
}
