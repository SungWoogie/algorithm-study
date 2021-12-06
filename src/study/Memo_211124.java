package study;

import java.util.Scanner;

public class Memo_211124 {

    private int num;

    public Memo_211124() {
        this.num = 10;
    }

    public Memo_211124(int num) {
        this.num = num;
    }

    public int 곱하기(int max) {
        return this.num * max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Memo_211124 memo_211124 = new Memo_211124(100);
        int max = 900;

        System.out.println(memo_211124.곱하기(max));


    }
}

class asdasd {

    public asdasd() {

    }


}
