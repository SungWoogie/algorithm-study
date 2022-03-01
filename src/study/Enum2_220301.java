package study;

enum kind {
    EAST(10, "<"), WEST(20, ">"), SOUTH(30, "^"), NORTH(40, "v");

    private static final kind[] kindArr = kind.values();
    private final int value;
    private final String symbol;

    kind(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static kind of(int kind) {
        if (kind < 1 || kind > 4) {
            throw new IllegalArgumentException("Invalid value :" + kind);
        }
        return kindArr[kind - 1];
    }

    public kind rotate(int num) {
        num = num % 4;
        if (num < 0) {
            num += 4;
        }
        return kindArr[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }
}

public class Enum2_220301 {
    public static void main(String[] args) {
        for (kind a : kind.values()) {
            System.out.printf("%s = %d%n", a.name(), a.getValue());
        }

        kind k1 = kind.EAST;
        kind k2 = kind.of(3);

        System.out.printf("d1 = %s, %d%n", k1.name(), k1.getValue());
        System.out.printf("d2 = %s, %d%n", k2.name(), k2.getValue());
        System.out.println(kind.EAST.rotate(1));
        System.out.println(kind.EAST.rotate(2));
        System.out.println(kind.EAST.rotate(-1));
        System.out.println(kind.EAST.rotate(-2));

    }
}
