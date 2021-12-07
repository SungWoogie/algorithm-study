package sungjun;

public class Remove_211207 { // indexRemove 중복값 출력
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 40};
        int index = 3;
        int[] result = solution(arr, index);

        for (int a : result) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int[] arr, int index) {
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) { // 5번 돌면서 값 확인
            if (arr[i] != arr[index]) { // 10, 10, 20, 50, 70
                newArr[count] = arr[i];
                count++;
            }
        }
        int[] returnArr = new int[count];
        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i] = newArr[i];
        }
        return returnArr;
    }
}
