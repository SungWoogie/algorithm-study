package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lv1_Kakao_220715 { // 카카오 실패율

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage = new double[N + 1];
        for (int i : stages) {
            if (i == N + 1) {
                continue;
            }
            stage[i]++;
        }

        List<Double> fail = new ArrayList<>();
        double num = stages.length;
        double tmp = 0;

        for (int i = 1; i < stage.length; i++) {
            tmp = stage[i];
            if (num == 0) {
                stage[i] = 0;
            } else {
                stage[i] = stage[i] / num;
                num = num - tmp;
            }
            fail.add(stage[i]);
        }
        fail.sort(Collections.reverseOrder());
        for (int i = 0; i < fail.size(); i++) {
            for (int j = 1; j < stage.length; j++) {
                if (fail.get(i) == stage[j]) {
                    answer[i] = j;
                    stage[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(n, stages)));
    }
}
