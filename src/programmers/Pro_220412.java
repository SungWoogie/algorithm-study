package programmers;

public class Pro_220412 {
    public static void main(String[] args) {
        String str = "027778888";
        System.out.println(solution(str));
    }

    public static StringBuilder solution(String str) {
        String answer = "";
        String temp = str.substring(str.length() - 4);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 4; i++) {
            sb.append(answer.replace("", "*"));
        }
        sb.append(temp);
        return sb;
    }
}
