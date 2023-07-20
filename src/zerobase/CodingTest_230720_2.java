package zerobase;

public class CodingTest_230720_2 {
    public static int solution(int[] votes) {
        int candidate = votes[0];
        int count = 1;

        for (int i = 1; i < votes.length; i++) {
            if (votes[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = votes[i];
                    count = 1;
                }
            }
        }

        int majority = votes.length / 2;
        count = 0;
        for (int num : votes) {
            if (num == candidate) {
                count++;
            }
            if (count > majority) {
                return candidate;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 3, 3, 3, 3, 1, 2, 2, 3})); // 3
    }

}
