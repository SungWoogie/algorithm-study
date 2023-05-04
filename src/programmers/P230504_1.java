package programmers;

// Lv0 -> 각도기
public class P230504_1 {
    public static int solution(int angle) {
        int answer = 0;
        if (angle == 90) {
            return 2;
        } else if (angle == 180) {
            return 4;
        } else if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle > 90 && angle < 180) {
            return 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(70)); // 1
        System.out.println(solution(91)); // 3
        System.out.println(solution(180)); // 4
        System.out.println(solution(90)); // 2
    }
}
