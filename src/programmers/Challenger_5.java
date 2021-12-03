package programmers;

public class Challenger_5 {
    public static void main(String[] args) {
        String str = "027778888";
        String strArr = solution(str);

        System.out.print(strArr);
    }

    public static String solution(String phone_number) { // 01033334444
        StringBuilder answer = new StringBuilder();
        int num = phone_number.length() - 4;

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < num) {
                answer.append("*");
            }
        }
        answer.append(phone_number.substring(num));
        return answer.toString();
    }
}
