package junseong;

public class JunSeong4_211208 {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= m; j++) {
                for (int k = j; k >= i; k--) {
                    sum += i + j + k;
                }
            }
        }
        System.out.println(sum);
    }
}
