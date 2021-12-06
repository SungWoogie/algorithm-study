package sungjun;

public class SungJun1_211130 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 10, 30}; // 메인에서 파라미터로 값 전달
        int[] arrayAdd = arrayAdd(arr);

    }

    public static int[] arrayAdd(int[] arr) {
        int[] newArr = new int[arr.length]; // 값 임시 저장소
        int[] returnArr = new int[arr.length]; // 값 비교 후 배열에 값 입력 후 리턴 할 배열


        int count = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] != arr[j]) {
                    newArr[i] = arr[i];
                } else {
                    count++;
                }
            }

        }

        return returnArr;
    }
}
