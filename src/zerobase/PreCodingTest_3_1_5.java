package zerobase;

// 구매할 수 있는 사탕 개수
public class PreCodingTest_3_1_5 {
    public static int solution(int n, int price) {
        int answer = 0;

        int purchased = 0; // 이미 구매한 사탕의 개수
        int cost = 0; // 소비한 비용

        while (purchased < n) {
            if (purchased + 10 <= n) {
                cost += price * 10; // 10+1 이벤트를 적용하여 10개의 사탕을 구매
                purchased += 11; // 구매한 사탕 개수 업데이트 (10개 구매 + 1개 무료)
            } else {
                cost += price * (n - purchased); // 남은 사탕의 개수만큼 구매
                purchased = n; // 구매한 사탕 개수 업데이트
            }
        }

        answer = cost;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(11, 10)); //100
        System.out.println(solution(20, 5)); // 95
    }

}
