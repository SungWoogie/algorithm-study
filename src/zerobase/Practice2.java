package zerobase;

public class Practice2 {
    public static void solution(int num) {
        int numReverse = 0;
        boolean isMinus = false;
        if (num < 0) {
            isMinus = true;
            num = num * -1;
        }
        while (num > 0) {
            int percent = num % 10; // 5 4 3
            num = num / 10; // 1234 123 12
            numReverse = numReverse * 10 + percent; // 5 54 543
        }
        if (isMinus) {
            int result = numReverse * -1;
            System.out.println(result);
        } else {
            System.out.println(numReverse);
        }

    }

    public static void main(String[] args) {
        solution(-12345);
        solution(12345);
        solution(100);
        solution(0);
        /*
        1. 54321
        2. -54321
        3. 1
        4. 0
         */
    }
}
