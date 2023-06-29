package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_230629_1 {
    public static String[][] solution(String[] titles, String[] lyrics, String[] problems) {
        int N = titles.length;
        int M = problems.length;

        // 시작 가사 일치하는 노래 제목을 저장할 2차원 문자열 배열
        List<List<String>> matchingSongs = new ArrayList<>();


        // matchingSongs 배열 초기화
        for (int i = 0; i < M; i++) {
            matchingSongs.add(new ArrayList<>());
        }

        // 각 문제에 대해 시작 가사 일치하는 노래를 찾아 matchingSongs 배열에 저장
        for (int i = 0; i < M; i++) {
            String problem = problems[i];
            for (int j = 0; j < N; j++) {
                String lyric = lyrics[j];
                if (lyric.startsWith(problem)) {
                    matchingSongs.get(i).add(titles[j]);
                }
            }
        }

        // matchingSongs 배열을 2차원 문자열 배열로 변환하여 반환
        String[][] result = new String[M][];
        for (int i = 0; i < M; i++) {
            result[i] = matchingSongs.get(i).toArray(new String[0]);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(
                new String[]{"아모르파티", "아기상어", "올챙이와개구리", "산다는건"},
                new String[]{
                        "산다는게다그런거지누구와빈손으로와...(후략)",
                        "아기상어뚜루루뚜루귀여운뚜루루뚜루...(후략)",
                        "개울가에올챙이한마리꼬물꼬물헤엄치다...(후략)",
                        "산다는건다그런거래요힘들고아픈날도많지만...(후략)"},
                new String[]{"산다", "아기상어", "올챙이"})));
        /* 결과
        {{"아모르파티","산다는건"},{"아기상어"},{}}
         */
    }
}
