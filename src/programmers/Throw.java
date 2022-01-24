package programmers;

public class Throw {
    public static void main(String[] args) {
        int[] array = new int[49];
        try {
            int a = ExceptionExam(array);
            System.out.println(a);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ExceptionExam(int[] array) throws IllegalArgumentException {
        if (array.length < 50) {
            throw new IllegalArgumentException("인덱스 범위를 초과했습니다.");
        }
        return array.length;
    }
}
