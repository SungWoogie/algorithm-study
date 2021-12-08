package sungjun;

public class Clear_1_211208 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50};

        int[] clear = clear(arr);
        for (int a : clear)
            System.out.print(a);
    }

    public static int[] clear(int[] arr) {
        return new int[0];
    }
}
