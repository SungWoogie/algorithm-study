package blog;

public class IntToString {
    public static void main(String[] args) {

        int value = 123;
        int value1 = 456;

        String str = String.valueOf(value); // int -> String 으로 형변환
        String str1 = String.valueOf(value1);

        System.out.println(str);
        System.out.println(str1);
    }
}
