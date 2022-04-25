package programmers;

public class Pro_220425 {
    public static void main(String[] args) {
        String str = "try hello";

        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder(); // 문자를 붙여서 출력하기 위해 StringBuilder 메소드 사용
        String[] text = str.split(""); // UpperCase, LowerCase 메소드 사용하기 위해 문자열을 split 하여 배열에 임시 저장
        int count = 0; // 제한사항에 문자열 전체 길이가 아닌 공백을 기준으로 단어 마다 인덱스 초기화 하려고 count 변수 생성

        for (int i = 0; i < str.length(); i++) { // 길이 만큼 반복
            if (text[i].equals(" ")) { // 공백이면 count 는 0 으로 초기화
                count = 0;
            } else {
                if (count % 2 == 0) { // count 가 짝수면 0번째 있는 문자열 값을 대문자로 바꿔서 저장
                    count++;
                    text[i] = text[i].toUpperCase();
                } else { // 그렇지 않으면 소문자로 바꿔서 해당 칸에 저장
                    count++;
                    text[i] = text[i].toLowerCase();
                }
            }
            answer.append(text[i]); // 빌더에 배열에 있는 값을 하나씩 저장
        }
        return answer.toString();
    }
}
