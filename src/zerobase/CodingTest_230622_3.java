package zerobase;

public class CodingTest_230622_3 {
    public static int solution(int delay, int N) {
        int[] amoebas = new int[N + 1]; // N분 후까지 생성되는 아메바 개체 수를 저장할 배열

        // 초기값 설정
        amoebas[0] = 1;

        for (int i = 1; i <= N; i++) {
            if (i >= delay) {
                // delay 분 후부터 새로운 아메바 개체가 생성되기 시작함
                amoebas[i] = amoebas[i - 1] + amoebas[i - delay];
            } else {
                // delay 분 이전은 이전 분의 아메바 개체 수와 동일함
                amoebas[i] = amoebas[i - 1];
            }
        }

        return amoebas[N];
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2)); // 5
    }
}
