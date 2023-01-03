package study;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("최성욱", 3);
        map.put("김성준", 0);

        int number1 = 0;
        number1 = map.get("최성욱");
        System.out.println("number1 : " + number1);

        if (map.get("최성욱") == 3) {
            System.out.println("키값 비교해서 밸류 맞아 ?");
            System.out.println(map.get("최성욱"));
        } else {
            System.out.println("아니야");
        }
    }
}
