package study.cloudstudy.conveniencestore;

public class Guest {

    private final String purchase;
    private final int price;
    private final int money;

    public Guest(String purchase, int price, int money) {
        this.purchase = purchase;
        this.price = price;
        this.money = money;
    }

    public int getPrice() {
        return price;
    }

    public String getPurchase() {
        return purchase;
    }
    public int getMoney(){
        return money;
    }
}
