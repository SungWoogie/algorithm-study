package zerobase;

public class CodingTest_230622_5 {
    public static int solution(int[] reward, int[] health, int[] optional) {
        int attack = 1; // 초기 공격력은 1
        int totalTime = 0; // 총 시간

        int bossHealth = health[0];
        while (bossHealth > 0) {
            bossHealth -= attack;
            totalTime++;
        }
        attack += reward[0];


        for (int i = 1; i < health.length; i++) {
            bossHealth = health[i];
            int bossAttack = reward[i];

            while (bossHealth > 0) {
                bossHealth -= attack;
                totalTime++;
                if (optional[i] == 1) {
                    attack += bossAttack;
                    break;
                }
                if (bossHealth <= 0) {
                    attack += bossAttack;
                }
            }
        }
        return totalTime;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{4, 2, 2, 0, 3, 5}, // 보스 잡으면 올라가는 공격력
                new int[]{10, 20, 20, 20, 40, 30}, // 보스 체력
                new int[]{1, 0, 1, 0, 0, 0})); // 선택형 보스
    }
}
