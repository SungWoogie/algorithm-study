package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_230607 {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            List<Integer> xyList = new ArrayList<>();
            xyList.add(i);
            xyList.add(i);
            map.put(i, xyList);
        }
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        map.put(0, integers);
        if (map.containsValue(map.values())){

        }

        System.out.println(map);
    }
}
