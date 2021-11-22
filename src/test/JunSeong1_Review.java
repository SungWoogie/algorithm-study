package test;

// 2021.11.23 반복문 배열 정방향으로 숫자 찍어내기
public class JunSeong1_Review {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < arr.length; i++) { // 10 - 100
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 3; i < arr.length; i++) { // 40 - 100
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 3; i++) { // 10 - 70
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 4; i < arr.length - 4; i++) { // 50 - 60
            System.out.print(arr[i] + " ");
        }
    }
}