package programmers;

public class Lv1_220705_1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        Lv1_220705_1 lv1_220705_1 = new Lv1_220705_1();
        System.out.println(lv1_220705_1.solution(nums));

    }

    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    System.out.println(sum);
                    if (isMinority(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;

    }

    public boolean isMinority(int num) {
        System.out.println("제곱근 : " + Math.sqrt(num));
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("여기가 몇인가 ? : " + num % i);
                return false;
            }
        }
        return true;
    }

}
