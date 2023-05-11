package test;

import java.util.*;

public class Test_230508 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("홍길동", 20);
        map.put("이순신", 30);
        map.put("주윤발", 40);

        map.put("주윤발", 20);

        System.out.println(map); // {홍길동=20, 이순신=30, 주윤발=20}

        System.out.println(map.get("이순신")); //key 값 이순신 의 value 값 얻기 : 30

        // entrySet 저장된 key 와 value 를 같이 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }
        //[Key]:홍길동 [Value]:20
        //[Key]:이순신 [Value]:30
        //[Key]:주윤발 [Value]:20


        //KeySet : 저장된 key 값 출력
        for(String name : map.keySet()){
            System.out.println(name);
        }
        // 홍길동
        // 이순신
        // 주윤발

        // values : 키에 저장되어 있는 value 값 출력
        for (int value : map.values()) {
            System.out.println(value);
        }
    }
}