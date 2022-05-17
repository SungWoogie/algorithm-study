package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParisTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paris paris = new Paris();

        int 손님수 = scanner.nextInt();

        List<Guest> list = new ArrayList<>();

        for (int i = 0; i < 손님수; i++) {
            int 빵개수 = scanner.nextInt();
            int 음료개수 = scanner.nextInt();
            String 이름 = scanner.next();
            Guest guest = new Guest(빵개수, 음료개수, 이름);
            list.add(guest);
        }

        for (Guest guest : list) {
            System.out.print(guest.get이름() + " ");
            System.out.println(paris.is빵이냐음료냐(guest));
        }


    }

}
