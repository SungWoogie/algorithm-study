package programmers;

import java.util.Arrays;

public class Lv1_220705_2 { // 모의고사
    public static void main(String[] args) {
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answer)));

    }

    public static int[] solution(int[] answers) {
        int[] answer;
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (first[i % first.length] == answers[i]) {
                score[0]++;
            }
            if (second[i % second.length] == answers[i]) {
                score[1]++;
            }
            if (third[i % third.length] == answers[i]) {
                score[2]++;
            }
        }

        // 가장 높은 점수 구하기
        int max = 0;
        for (int k : score) {
            if (k > max) {
                max = k;
            }
        }

        // 가장 높은 점수를 받은 사람 구하기
        int maxCount = 0;
        for (int j : score) {
            if (j == max) {
                maxCount++;
            }
        }
        answer = new int[maxCount];
        int index = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                answer[index++] = i + 1;
            }
        }

        return answer;
    }
}
