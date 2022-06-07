package sungjun.soccer;

public class User {

    private final String teamName;
    private int amount;

    public User(String teamName,int amount) {
        this.teamName = teamName;
        this.amount = amount;
    }

    public void win(int price) {
        this.amount *= price;
    }

    public void lose() {
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public String getTeamName() {
        return teamName;
    }
}
