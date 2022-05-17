package study;

public class pri {
    public static void main(String[] args) {
        String A = "Java";  // 리터럴 값 String Constant Pool 영역에 생성
        String B = "Java";  // 리터럴 값 String Constant Pool 영역에 생성
        String C = new String("Java");  // new 연산자 Heep 영역
        String D = new String("Java");  // new 연산자 Heep 영역

        System.out.println(A == B);
        System.out.println(B == C);
        System.out.println(C == D);

        System.out.println(A.equals(B));
        System.out.println(B.equals(C));
        System.out.println(C.equals(D));

    }
}
