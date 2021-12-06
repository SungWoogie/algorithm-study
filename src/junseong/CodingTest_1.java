package junseong;

import java.util.Arrays;

public class CodingTest_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] tempArr = new int[3]; // 임시 배열 만들기 만들어서 1,2,3 카운터 한 값 넣어줄 배열 생성
        int[] resultArr = new int[3]; // 1,2,3 의 max 값을 찾고 그 값을 return 해주는 배열 생성

        int count = 0; // count 라는 저장소를 만들어서 같은 숫자가 몇번 들어가는지 저장하는 저장소
        int max = 0; // count 한 값 중에 제일 큰 큰 값을 찾아 필요한 값 체크 하기 위한 저장소

        for (int num : arr) { // 파라미터로 받은 배열을 num 에 [i] 번째 부터 대입
            for (int i : arr) {
                if (num == i) {
                    count++;
                    if (num == 1) {
                        tempArr[0] = count;
                    } else if (num == 2) {
                        tempArr[1] = count;
                    } else {
                        tempArr[2] = count;
                    }
                }
            }
            count = 0;
        }
        for (int i = 0; i < tempArr.length; i++) { // max 값 찾아내기 위한 조건문
            if (tempArr[0] > tempArr[1]) {
                max = tempArr[0];
            } else if (tempArr[1] > tempArr[2]) {
                max = tempArr[1];
            } else {
                max = tempArr[2];
            }
            resultArr[i] = max - tempArr[i]; // max 값을 찾고 그 값을 [i]번째 부터 순서대로 대입
        }
        return resultArr;
    }
}
