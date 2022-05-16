package programmers;

public class Pro_220516 {

    public static boolean solution(String str) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!str.contains("p") && !str.contains("P") && !str.contains("y") && !str.contains("Y"))
                return answer;
            else if (str.charAt(i) == 'p' || str.charAt(i) == 'P') {
                pCount++;
            } else if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                yCount++;
            }
        }
        if (pCount != yCount) {
            return false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "pPoooy";
        System.out.println(solution(str));
    }
}
