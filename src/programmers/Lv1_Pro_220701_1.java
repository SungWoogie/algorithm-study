package programmers;

public class Lv1_Pro_220701_1 {
    public int solution(String dartResult) {
        int answer = 0;

        int[] dart = new int[3];

        int n = 0;
        int index = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            //숫자일 때
            if (c >= '0' && c <= '9') {
                sb.append(c);
            }
            //보너스일 때
            else if (c == 'S' || c == 'D' || c == 'T') {
                n = Integer.parseInt(sb.toString());
                if (c == 'S') {
                    dart[index++] = (int) Math.pow(n, 1);
                } else if (c == 'D') {
                    dart[index++] = (int) Math.pow(n, 2);
                } else {
                    dart[index++] = (int) Math.pow(n, 3);
                }
                sb = new StringBuilder();
            }
            //옵션일 때
            else {
                if (c == '*') {
                    dart[index - 1] *= 2;
                    if (index - 2 >= 0) dart[index - 2] *= 2;
                } else {
                    dart[index - 1] *= (-1);
                }
            }
        }

        answer = dart[0] + dart[1] + dart[2];

        return answer;
    }


    public static void main(String[] args) {
        String str = "1S2D*3T";
        Lv1_Pro_220701_1 s = new Lv1_Pro_220701_1();

        System.out.println(s.solution(str));
    }
}
