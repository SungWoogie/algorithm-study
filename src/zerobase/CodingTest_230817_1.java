package zerobase;

public class CodingTest_230817_1 {
    public static int solution(int n, int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < n; i++) {
            StringBuilder newStr = new StringBuilder();
            int count = 1;

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    count++;
                } else {
                    newStr.append(count).append(str.charAt(j - 1));
                    count = 1;
                }
            }

            newStr.append(count).append(str.charAt(str.length() - 1));
            str = newStr.toString();

            if (str.length() > 5) {
                str = str.substring(0, 5);
            }
        }

        int result = Integer.parseInt(str);
        return result % 10004;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 54223));
    }

}
