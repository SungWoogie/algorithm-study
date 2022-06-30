package programmers;

public class Lv1_Pro_220630 {
    public static String solution(String phone_number) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        answer = phone_number.substring(phone_number.length() - 4);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(answer);

        return sb.toString();
    }

    public static void main(String[] args) {
        String phone_number = "01033334444";

        System.out.println(solution(phone_number));
    }
}
