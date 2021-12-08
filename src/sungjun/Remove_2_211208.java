package sungjun;

public class Remove_2_211208 { // IndexRemove 인덱스 입력하면 그 인덱스 삭제 후 나머지 값 출력
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 10};
        int[] index = new int[]{0, 4};

        int[] result = solution(arr, index);

        for (int i : result) {
            System.out.println(i);
        }

    }


    public static int[] solution(int[] arr, int[] index) {
        int[] newArr = new int[arr.length - index.length];
        int count = 0; // 1
        int num = 0; // 0 1 2

        for (int i = 0; i < arr.length; i++) {
            if (i != index[count]) {
                newArr[num] = arr[i]; // 1 2 3
                num++;
            } else {
                count++;
            }
        }
        return newArr;
    }
}
