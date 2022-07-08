package programmers;

import java.util.Arrays;

public class Lv1_220708 { // 모의고사 다시 품
    public static int[] solution(int[] answers) {

        int[] personArr1 = new int[]{1, 2, 3, 4, 5};
        int[] personArr2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] personArr3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] tmpArr = new int[3];

        for (int i = 0; i < answers.length; i++) { // 각각의 수포자들 점수 구함
            if (personArr1[i % personArr1.length] == answers[i]) {
                tmpArr[0]++;
            }
            if (personArr2[i % personArr2.length] == answers[i]) {
                tmpArr[1]++;
            }
            if (personArr3[i % personArr3.length] == answers[i]) {
                tmpArr[2]++;
            }
        }
        int max = 0;
        for (int i = 0; i < tmpArr.length; i++) { // 최대값 구함
            if (tmpArr[i] > max) {
                max = tmpArr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < tmpArr.length; i++) { // 같은 값 있는지 확인
            if (max == tmpArr[i]) {
                count++;
            }
        }

        int[] countArr = new int[count];
        int index = 0;
        for (int i = 0; i < tmpArr.length; i++) {
            if (tmpArr[i] == max) {
                countArr[index++] = i + 1;
            }
        }
        return countArr;
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers)));
    }
}
