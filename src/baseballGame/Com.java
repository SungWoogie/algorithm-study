package baseballGame;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Com {

    public static Set<Integer> set = new LinkedHashSet<>();

    public static List<Integer> 컴퓨터숫자생성() {

        while (set.size() != 3) { // 컴퓨터 숫자 생성
            for (int i = 0; i < 3; i++) {
                set.add((int) (Math.random() * 9) + 1);
            }
        }
        return new ArrayList<>(set); // set 값 가져오기 위해 List 로 변환
    }
}
