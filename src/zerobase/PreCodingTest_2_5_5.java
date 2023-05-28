package zerobase;

// min or heap 중 어디인지 출력
public class PreCodingTest_2_5_5 {
    public static String solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int parentIndex = i / 2;
            if (arr[parentIndex] > arr[i]) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 5, 10, 15})); // YES
        System.out.println(solution(new int[]{0, 20, 22, 17})); // NO
    }
}


