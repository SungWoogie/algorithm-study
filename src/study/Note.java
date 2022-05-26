package study;

public enum Note {
    LION("King"),
    TIGER("Red"),
    DOG("Jindo");


    private final String name;

    Note(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class noteTest {
    public static void main(String[] args) {
        System.out.println(Note.valueOf("DOG"));
        System.out.println(Note.valueOf("LION"));
        System.out.println(Note.valueOf("TIGER"));
    }
}
