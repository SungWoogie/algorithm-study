package sungjun;

public class SungJun2_211201 {
    public static void main(String[] args) {
        int index = 2;
        int num = 1000;
        int[] arr = new int[]{10, 30, 50, 80, 90};

        for (int a : indexAdd(arr, index, num)) {
            System.out.print(a + " ");
        }
    }

    public static int[] indexAdd(int[] arr, int index, int num) {
        int[] returnArray = new int[arr.length + 1]; // 기존 배열보다 한개 더 많은 배열 생성

        int count = 0; // arr 의 크기만큼만 돌기위해 만든 카운트
        for (int i = 0; i < returnArray.length; i++) { //i는 returnArray 의 크기만큼 돌기위한 변수
            if (index == i) {
                returnArray[index] = num;
            } else {
                returnArray[i] = arr[count];
                count++;
            }
        }
        return returnArray;
    }
}
