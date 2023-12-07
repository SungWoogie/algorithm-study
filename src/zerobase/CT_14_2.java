package zerobase;

public class CT_14_2 {
    public static String solution(String s, int k) {
        StringBuilder result = new StringBuilder();
        int removal = k;

        for (char ch : s.toCharArray()) {
            while (removal > 0 && result.length() > 0 && result.charAt(result.length() - 1) > ch) {
                result.deleteCharAt(result.length() - 1);
                removal--;
            }
            result.append(ch);
        }
        result.setLength(result.length() - removal);

        int startIndex = 0;
        while (startIndex < result.length() - 1 && result.charAt(startIndex) == '0') {
            startIndex++;
        }
        return result.substring(startIndex);
    }

    public static void main(String[] args) {
        String s = "105990";
        int k = 1;
        System.out.println(solution(s, k));
    }

}
