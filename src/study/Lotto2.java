package study;

import java.sql.Connection;
import java.util.*;

public class Lotto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int input = scanner.nextInt();

        List<List<Integer>> lottoNumbers = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            Set<Integer> lottoNumber = new LinkedHashSet<>();
            while (lottoNumber.size() != 6) {
                lottoNumber.add(random.nextInt(45) + 1);
            }
            List<Integer> tempLotto = new ArrayList<>(lottoNumber);
            Collections.sort(tempLotto);
            lottoNumbers.add(tempLotto);
        }

        for (List<Integer> a : lottoNumbers) {
            System.out.println(a);
        }


        List<Integer> winningNumbers = new ArrayList<>();
        System.out.println("위닝 넘버 입력");
        String[] strings = scanner.next().split(",");
        for (int i = 0; i < 6; i++) {
            winningNumbers.add(Integer.valueOf(strings[i]));
        }

        for (int i = 0; i < input; i++) {
            int count = 0;
            for (int j = 0; j < lottoNumbers.get(i).size(); j++) {
                for (Integer winningNumber : winningNumbers) {
                    if (lottoNumbers.get(i).get(j).equals(winningNumber)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

//        for (Map.Entry<Integer, Integer> entry : prizeCounts.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getKey());
//        }
    }


//        Map.Entry<Integer, Integer> maxEntry = null;
//
//        Set<Map.Entry<Integer, Integer>> entrySet = prizeCounts.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entrySet) {
//            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
//                maxEntry = entry;
//            }
//        }
//        System.out.println(maxEntry.getKey() + " : " + maxEntry.getValue());
}
