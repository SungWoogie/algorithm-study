package blog;

public class toCharArr {
    public static void main(String[] args) {

        String str = "Hello World";
        char[] ch = str.toCharArray();

        for (char word : ch) {
            System.out.print(word + " "); // 보기 쉽게 띄어쓰기
        }
    }
}
