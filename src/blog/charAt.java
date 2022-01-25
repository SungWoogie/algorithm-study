package blog;

public class charAt {
    public static void main(String[] args) {

        String str = "안녕하세요";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print(ch + " ");
        }
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.println(str.charAt(0));
        }
    }
}
