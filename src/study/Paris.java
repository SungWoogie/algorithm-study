package study;

import java.util.List;

public class Paris {

    private static final int bread = 1000;
    private static final int drink = 500;

    public int is빵이냐음료냐(Guest guest) {
        int 합계 = 0;
        if (guest.getBreadCount() > 0) {
            합계 += 빵계산하다(guest.getBreadCount());
        }
        if (guest.getDrinkCount() > 0) {
            합계 += 음료계산하다(guest.getDrinkCount());
        }
        return 합계;
    }

    public int 빵계산하다(int count) {
        return bread * count;
    }

    public int 음료계산하다(int count) {
        return drink * count;
    }

}
