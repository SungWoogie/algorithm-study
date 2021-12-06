package test;

public class JunSeong_RandomNumber2 {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 10, 11, 12, 13, 14, 10, 15, 19, 18, 15, 10, 10, 10, 10};

        int i = 10;
        for (int a : randomNumber(arr)) {
            System.out.println();
            System.out.printf("번호 %d : %d", i, a);
            i++;
        }
    }

    public static int[] randomNumber(int[] array) {
        int[] newArray = new int[10]; // 제한숫자 10~19니까

        int count = 0;

        for (int i = 10; i <= 19; i++) {
            for (int k : array) { // 메인에서 넘어온 배열값과 위에 포문 i부터 19까지 하나씩 비교
                if (k == i) {
                    count++;
                }
            }
            newArray[i - 10] = count;
            count = 0;
        }
        for (int k : newArray) { // 확인하기 위한 foreach
            System.out.print(k + " ");
        }
        System.out.println();
        return newArray;
    }
}
