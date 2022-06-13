package programmers;

public class Pro_220613_2 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        String answer = "";
        String temp = phone_number.substring(phone_number.length() - 4);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append(answer.replace("", "*"));
        }
        answer = String.valueOf(sb.append(temp));
        return answer;
    }
}
