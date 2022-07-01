package programmers;

public class Lv1_Pro_220701 {
    public int solution(String dartResult) {
        int answer = 0;

        StringBuilder temp = new StringBuilder();
        int[] arr = new int[3];
        int index = 0;

        for (int i = 0; i < dartResult.length(); i++) {

            switch (dartResult.charAt(i)) {

                case '*':
                    arr[index - 1] *= 2;
                    if (index > 1) arr[index - 2] *= 2;
                    break;
                case '#':
                    arr[index - 1] *= -1;
                    break;
                case 'S':
                    arr[index] = (int) Math.pow(Integer.parseInt(temp.toString()), 1);
                    index++;
                    temp = new StringBuilder();
                    break;
                case 'D':
                    arr[index] = (int) Math.pow(Integer.parseInt(temp.toString()), 2);
                    index++;
                    temp = new StringBuilder();
                    break;
                case 'T':
                    arr[index] = (int) Math.pow(Integer.parseInt(temp.toString()), 3);
                    index++;
                    temp = new StringBuilder();
                    break;

                default:
                    temp.append(dartResult.charAt(i));
                    break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        String str = "1S2D*3T";
        Lv1_Pro_220701 s = new Lv1_Pro_220701();

        System.out.println(s.solution(str));
    }
}
