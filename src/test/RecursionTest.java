package test;

public class RecursionTest {
    public static void compareRecursion(int n) {
        System.out.println("recursion Call!!!!" + n);
        if (n == 0) {
            return;
        }
        compareRecursion(n - 1);
        System.out.println("recursion return!!!!" + n);
    }


    public static void main(String[] args) {
        compareRecursion(4);
    }
}
