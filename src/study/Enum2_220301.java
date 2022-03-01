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
}

public class Enum2_220301 {
    public static void main(String[] args) {
        for (kind a : kind.values()) {
            System.out.printf("%s = %d%n", a.name(), a.getValue());
        }
    }
}
