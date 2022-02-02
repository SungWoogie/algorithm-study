package programmers;

public class Ex_MakeWeirdText {
    public static void main(String[] args) {
        String str = "try hello world";
        System.out.println(solution(str));

    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        String[] word = str.split("");
        String blank = " ";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (blank.equals(word[i])) {
                count = 0;
            } else {
                if (count % 2 == 0) {
                    count++; // 1
                    word[i] = word[i].toUpperCase();
                } else {
                    count++; // 2
                    word[i] = word[i].toLowerCase();
                }
            }
            answer.append(word[i]);
        }

        return answer.toString();
    }
}
