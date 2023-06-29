package zerobase;

public class CodingTest_230622_1 {
    public static int solution(int N, int[][] trust) {
        int[] trustCounts = new int[N + 1]; // 각 사람이 믿는 사람의 수를 기록할 배열

        for (int[] relation : trust) {
            int a = relation[0]; // 믿는 사람의 고유번호
            int b = relation[1]; // 믿음을 받는 사람의 고유번호
            trustCounts[a]--; // 믿는 사람의 trustCounts 값을 감소시킴
            trustCounts[b]++; // 믿음을 받는 사람의 trustCounts 값을 증가시킴
        }

        for (int i = 1; i <= N; i++) {
            if (trustCounts[i] == N - 1) { // trustCounts 값이 N-1인 사람을 마을 판사로 판단
                return i; // 마을 판사의 고유번호 반환
            }
        }
        return -1; // 마을 판사가 존재하지 않을 경우 -1 반환
    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1, 3}, {2, 3}})); // 3
    }
}
