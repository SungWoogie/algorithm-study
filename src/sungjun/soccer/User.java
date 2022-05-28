package sungjun.soccer;

public class User {

    private final int count;
    private final int amount;

    public User(int count, int amount) {
        this.count = count;
        this.amount = amount;
    }

    public int getCount() {
        return count;
    }

    public int getAmount() {
        return amount;
    }
}
