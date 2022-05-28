package sungjun.soccer;

public enum Team {
    TOTTENHAM(3, 1000),
    ARSENAL(4, 1000),
    MANCHESTER_CITY(2, 1000),
    MANCHESTER_UNITED(4, 1000),
    LIVERPOOL(2, 1000),
    CHELSEA(3, 1000),
    LEICESTER_CITY(6, 1000);

    private final int dividend;
    private final int money;

    Team(int dividend, int money) {
        this.dividend = dividend;
        this.money = money;
    }

    public int getDividend() {
        return dividend;
    }

    public int getMoney() {
        return money;
    }

}
