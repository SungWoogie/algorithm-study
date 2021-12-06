package sungjun;

import java.util.Scanner;

public class SungJun5_211201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int num = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] arr1 = indexSearch(arr, num);
        for (int i : arr1) {
            System.out.print(i + " " + "정답");
        }
    }

    public static int[] indexSearch(int[] arr, int num) {
        int[] returnArray = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) { //여기서 넘이 몇개나 있는지 카운트로 체크함
            if (num == arr[i]) {
                returnArray[i] = i;
                count++;
            }
        }

        int[] newArr = new int[count]; //있는 수만큼의 크기로 배열을 만들어줌
        count = 0; //리셋
        for (int i = 0; i < returnArray.length; i++) { //0이 아닌 인덱스를 저장해놨으니 그걸 newArr 에 넣어줌
            if (returnArray[i] != 0) {
                newArr[count] = returnArray[i];
                count++;
            }
        }

        return newArr;
    }
}

