package programmers;

import java.util.Arrays;

public class Pro_220419 {
    public static void main(String[] args) {
        int[] arr = {10};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1]; // 제일 작은 수 하나 제거 이므로 기존 길이 -1

        if (arr.length == 1) { // 배열 길이가 1과 같다면 -1을 리턴.
            return new int[]{-1};
        }

        int min = arr[0]; // 제일 작은 값 고르기 위하여 배열에 값 하나 저장
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]); // 길이 만큼 돌면서 Math.min 메소드 활용하여 작은 값 찾아 놓기
        }
        int count = 0; // 카운트 변수를 인덱스 위치로 활용하기 위한 변수 생성
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) { // 위에 반복문에서 작은값 찾은 것 과 다른 값 찾기
                answer[count] = arr[i]; // 리턴 할 배열에 다른 값 하나씩 저장
                count++; // 인덱스 위치 바꿔주기 위하여 count 활용
            }
        }
        return answer;
    }
}
