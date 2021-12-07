package sungjun;

public class Contains_1_211207 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        int num = 40;
        boolean result = solution(arr, num);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean solution(int[] arr, int num) {
        int count = 0;

        for (int a : arr) {
            if (a == num) {
                count++;
            }
        }
        return count >= 1;
    }
}
