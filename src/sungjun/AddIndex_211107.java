package sungjun;

public class AddIndex_211107 {
    public static void main(String[] args) {
        int[] arr = new int[]{77, 11, 22, 0, 55, 99};
        int index = 3;
        int num = 1000;
        int[] result = solution(arr, index, num);
        for (int a : result) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int[] arr, int index, int num) {
        int[] newArr = new int[arr.length + 1];
        int count = 0;

        for (int i = 0; i < newArr.length; i++) {
            if (index == i) {
                newArr[index] = num;
            } else {
                newArr[i] = arr[count];
                count++;
            }
        }
        return newArr;
    }
}
