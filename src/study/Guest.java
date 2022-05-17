package study;

public class Guest {

    private final int breadCount;
    private final int drinkCount;
    private final String 이름;

    public Guest(int breadCount, int drinkCount, String 이름) {
        this.drinkCount = drinkCount;
        this.breadCount = breadCount;
        this.이름 = 이름;
    }

    public int getBreadCount() {
        return breadCount;
    }

    public int getDrinkCount() {
        return drinkCount;
    }


    public String get이름() {
        return 이름;
    }

}
