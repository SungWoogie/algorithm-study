package programmers;

public class Pro_220523 {
    public static void main(String[] args) {
        int[][] arr = {{10, 7},
                {12, 3},
                {8, 15},
                {14, 7},
                {5, 15}};
        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {   // 최소직사각형

        int answer = 0;
        int maxWidth = 0; // 가로
        int maxHeight = 0; // 세로

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < 2; j++) {

                if (arr[i][0] < arr[i][1]) {    // 가로보다 세로가 더 길면 인덱스 변경
                    temp = arr[i][0];
                    arr[i][0] = arr[i][1];
                    arr[i][1] = temp;
                }

                if (maxWidth < arr[i][0]) {     // 가장 큰 가로 길이
                    maxWidth = arr[i][0];
                }
                if (maxHeight < arr[i][1]) {    // 가장 큰 세로 길이
                    maxHeight = arr[i][1];
                }
            }
        }
        answer = maxWidth * maxHeight;  // 곱해서 리턴

        return answer;
    }
}
