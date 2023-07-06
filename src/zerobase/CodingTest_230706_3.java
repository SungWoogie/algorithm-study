package zerobase;

// 피크 찾기
public class CodingTest_230706_3 {
    public static int solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // 피크가 존재하지 않는 경우 -1 반환
        if (left == 0 || left == arr.length - 1) {
            return -1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, 0, 3, 4, 5, 12, 15, 14, 12, 11})); // 6
    }
}