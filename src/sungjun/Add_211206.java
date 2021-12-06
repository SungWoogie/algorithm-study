package sungjun;

public class Add_211206 {
    public static void main(String[] args) {
        int num = 50;
        int[] arr = new int[]{77, 11, 22, 0, 55, 99};
        int[] result = solution(arr, num);

        for (int a : result) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(int[] arr, int num) {

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = num;
        return newArr;
    }
}
