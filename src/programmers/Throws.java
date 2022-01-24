package programmers;

public class Throws {
    public static void main(String[] args) {
        int[] array = new int[49];

        try {
            int arr = ExceptionExam(array);
            System.out.println(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ExceptionExam(int[] array) throws ArrayIndexOutOfBoundsException {
        if (array.length < 50) {
            throw new ArrayIndexOutOfBoundsException("인덱스 범위가 작아.");
        }
        return array.length;
    }
}
