package study;

public class Note {
    int result;

    public static void main(String[] args) {
        Note a = new Note(10);
        Note b = new Note(20);
        System.out.println(a.result + " " + b.result);
        swap(a, b);
        System.out.println(a.result + " " + b.result);
    }

    public Note(int result) {
        this.result = result;
    }

    public static void swap(Note a, Note b) {
        int temp = a.result;
        a.result = b.result;
        b.result = temp;
    }
}


