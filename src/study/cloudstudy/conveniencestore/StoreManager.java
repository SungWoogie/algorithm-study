package study.cloudstudy.conveniencestore;

import java.util.Scanner;

public class StoreManager {

    public void proceed() {
        Scanner scanner = new Scanner(System.in);

        Output.printGreetMessage();
        Output.printPurchaseItemMessage();

        String purchase = scanner.next();
        int count = scanner.nextInt();
        int guestMoney = scanner.nextInt();

        Guest guest = new Guest(purchase, count, guestMoney);
        Store store = new Store(guest.getPurchase(), guest.getPrice());

        System.out.println(store);
        Output.printGoodbyeMessage();

    }
}
