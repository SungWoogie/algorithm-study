package programmers;


public class Lv1_Pro_220630_3 {
    public double solution(int[] arr) {

        double answer = 0;
        double sum = 0;

        for (int j : arr) {
            sum += j;
        }
        answer = sum / arr.length;
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {5, 5};
        Lv1_Pro_220630_3 s = new Lv1_Pro_220630_3();

        System.out.println(s.solution(arr));
    }
}
