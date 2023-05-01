package zerobase;

// 구구단 출력
public class Test_1 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j < 10){
                    System.out.printf("0%d x 0%d = 0%d\t", j, i, j * i);
                } else {
                    System.out.printf("0%d x 0%d = %d\t", j, i, j * i);
                }
            }
            System.out.println();
        }
    }
}
