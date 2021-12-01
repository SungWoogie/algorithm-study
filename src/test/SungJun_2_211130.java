package test;

public class SungJun_2_211130 {
    public static void main(String[] args) {
        int index = 0;
        int[] arr = new int[]{2, 7, 3, 1, 5};
        int[] indexAdd = indexAdd(arr, index);


    }

    public static int[] indexAdd(int[] arr, int index) {
        int[] tempArray = new int[arr.length + 1]; // 기존 배열보다 한개 더 많은 배열 생성

        for (int i = 0; i < tempArray.length; i++) {
            if (index == i) {
                tempArray[i] = tempArray[index];
            }
        }

        return null;
    }
}
