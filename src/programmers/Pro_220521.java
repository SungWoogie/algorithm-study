package programmers;

public class Pro_220521 { // 부족한 금액 계산하기
    public static long solution(int price, int money, int count) {
        long answer = 0;

        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }
        if (sum > money){
            answer = sum - money;
        }
        return answer;
    }

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(solution(price, money, count));

    }
}
