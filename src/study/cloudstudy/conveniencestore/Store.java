package study.cloudstudy.conveniencestore;

public class Store {

    private final String purchase;
    private final int price;

    public Store(String purchase, int price) {
        this.purchase = purchase;
        this.price = price;
    }

    public String getPurchase() {
        return purchase;
    }

    public int getPrice() {
        return price;
    }

    public int doPay() {
        return 0;
    }
}
