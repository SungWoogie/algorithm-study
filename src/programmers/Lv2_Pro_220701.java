package programmers;

import java.util.Arrays;

public class Lv2_Pro_220701 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100]; // 작업 개수가 100 이하 이므로 100으로 설정
        int day = 0; // 배포 일 수

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;
        }
        int count = 0;

        for (int n : temp) {
            if (n != 0) {
                count++;
            }
        }
        int[] answer = new int[count];
        count = 0;
        for (int n : temp){
            if (n != 0){
                answer[count++] = n;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        Lv2_Pro_220701 s = new Lv2_Pro_220701();

        System.out.println(Arrays.toString(s.solution(progresses, speeds)));
    }
}
