package zerobase;

// 조건에 맞춰서 출력
public class PreCodingTest_3_2_3 {
    public static String solution(int[] arr, String prefix, String separator, String postfix) {
        StringBuilder sb = new StringBuilder(prefix);
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (!(arr.length - 1 == i)) {
                sb.append(separator);
            }
        }
        sb.append(postfix);
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 0, 7, 9}, "<", ", ", ">")); //<1, 3, 0, 7, 9>
    }

}

