package zerobase;

import java.util.*;

// 평균 구해서 A등급 몇명인지 세기
public class PreCodingTest_3_1_2 {
    public static int solution(int[] arr) {
        int answer = 0; // 최대 A 학점 인원 수
        int targetCount = 0; // 50% 경계 성적을 받은 학생 수

        Map<Integer, Integer> gradeMap = new HashMap<>();
        for (int score : arr) {
            gradeMap.put(score, gradeMap.getOrDefault(score, 0) + 1);
        }

        List<Integer> sorts = new ArrayList<>(gradeMap.keySet());
        sorts.sort((a, b) -> (b - a)); // 오름차순 정렬후, 람다식으로 뒤집기

        for (int grade : sorts) {
            targetCount += gradeMap.get(grade);
            if (targetCount >= arr.length / 2) {
                break;
            }
        }
        // A 학점 인원 수는 50% 경계 성적을 받은 학생 수와 전체 학생 수 중 작은 값
        answer = Math.min(targetCount, arr.length);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 95, 95, 95, 90})); // 4
        System.out.println(solution(new int[]{0, 0, 0, 0, 0})); // 5
    }

}
