package sungjun_1;

import java.util.Scanner;

public class kim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Count count = new Count();
        Cclass cclass = new Cclass();


        System.out.println(cclass.multiply(count.sum(a, b)));
    }
}
