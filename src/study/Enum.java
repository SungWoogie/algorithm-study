package study;

public class Enum {
    enum kind {EAST, WEST, SOUTH, NORTH}

    public static void main(String[] args) {
        kind kind1 = kind.EAST;
        kind kind2 = kind.valueOf("WEST");

        System.out.println(kind1.compareTo(kind2));

        kind[] kinds = kind.values();
        for (kind a : kinds) {
            System.out.printf("%s = %d%n", a.name(), a.ordinal());
        }
    }
}
