package study;

public class Note {

    public static void main(String[] args) {
        int result = 100;
        int num = 4;
        int count = 0;

        while (result >= 8) {
        result -= num;
        count += 1;
        }
        System.out.println(count);
    }
}


