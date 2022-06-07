package sungjun.soccer;

public class Boss {

    private int strongBox;

    public Boss() {
        this.strongBox = 0;
    }

    public int getStrongBox() {
        return strongBox;
    }

    public void receive(int money) {
        strongBox += money;
    }
}
