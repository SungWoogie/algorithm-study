package programmers;

public class P230426_String {
    public static void main(String[] args) {
        System.out.println(solution("500220839878", "7"));
//        System.out.println(solution("10203", "15"));
//        System.out.println(solution("3141592", "271"));

    }

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            long number = Long.parseLong(str); // 314
            if (number <= Long.parseLong(p)) {
                answer++;
            }

        }
        return answer;
    }
}

        /*
        p 의 길이 값을 구해야한다.
        구한 길이 값 만큼 t 를 자르고 각각의 값을 저장한다.
        p 의 값과 비교한다. (p의 값 보다 작거나 같은 값은 값)
        조건에 해당하는 값을 카운트 한다.
         */

