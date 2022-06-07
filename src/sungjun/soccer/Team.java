package sungjun.soccer;

import java.util.Random;

public enum Team {
    TOTTENHAM(3),
    ARSENAL(4),
    MANCHESTER_CITY(2),
    MANCHESTER_UNITED(4),
    LIVERPOOL(2),
    CHELSEA(3),
    LEICESTER_CITY(6);

    private final int dividend;

    Team(int dividend) {
        this.dividend = dividend;
    }

    public int getDividend() {
        return dividend;
    }

}
