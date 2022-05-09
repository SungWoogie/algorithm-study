package programmers;

public class Pro_220509 {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {  // 2~n 까지의 제약 조건
            boolean pass = true;    // answer 1증가하기 위해 boolean 변수 생성
            for (int j = 2; j <= Math.sqrt(i); j++) {   // Math.sqrt 메소드 생성 값을 전달하면 그 값의 제곱근 반환
                if (i % j == 0) {   // i와 제곱근 나머지 구했을 때 0인지 확인
                    pass = false;   // 나누어지면 false 로 바꾸고 break
                    break;
                }
            }
            if (pass) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }
}
