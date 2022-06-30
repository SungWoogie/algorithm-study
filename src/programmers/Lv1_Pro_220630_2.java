package programmers;


public class Lv1_Pro_220630_2 {
    public int solution(int[][] sizes) {

        int widthMax = 0;
        int heightMax = 0;
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            int num = 0;
            for (int j = 0; j < sizes[0].length; j++) {
                if (sizes[i][0] < sizes[i][1]) {
                    num = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = num;
                }
                if (widthMax < sizes[i][0]) {
                    widthMax = sizes[i][0];
                }

                if (heightMax < sizes[i][1]) {
                    heightMax = sizes[i][1];
                }
                answer = widthMax * heightMax;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Lv1_Pro_220630_2 s = new Lv1_Pro_220630_2();

        System.out.println(s.solution(sizes));
    }
}
