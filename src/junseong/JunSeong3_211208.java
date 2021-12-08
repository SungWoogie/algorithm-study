package junseong;

public class JunSeong3_211208 {
    public static void main(String[] args) {
        int length = 1;

        System.out.println(asd2(length));

    }

    public static int asd2(int length) {
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 2; j > -1; j--) {
                result = i + j;
            }
        }
        return result;
    }
}
