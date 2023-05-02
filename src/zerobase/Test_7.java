package zerobase;

import java.util.*;

// 로또 당첨 프로그램
public class Test_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("[로또 당첨 프로그램]\n");

        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int buyLotto = scanner.nextInt();

        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        char endChar = (char) ('A' + buyLotto - 1);
        for (char ch = 'A'; ch <= endChar; ch++) {
            List<Integer> list = new ArrayList<>();
            while (list.size() != 6) {
                int num = random.nextInt(45) + 1;
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            Collections.sort(list);
            map.put(ch, list);
        }
        for (Map.Entry<Character, List<Integer>> lottos : map.entrySet()) {
            System.out.printf("%s\t", lottos.getKey());
            for (int i = 0; i < lottos.getValue().size(); i++) {
                if (lottos.getValue().get(i) < 10) {
                    System.out.print("0" + lottos.getValue().get(i));
                } else {
                    System.out.print(lottos.getValue().get(i));
                }
                if (i != lottos.getValue().size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        System.out.println("\n[로또 발표]");
        List<Integer> winningNumbers = new ArrayList<>();
        while (winningNumbers.size() != 6) {
            int winningNumber = random.nextInt(45) + 1;
            if (!winningNumbers.contains(winningNumber)) {
                winningNumbers.add(winningNumber);
            }
        }
        Collections.sort(winningNumbers);
        for (int i = 0; i < winningNumbers.size(); i++) {
            if (winningNumbers.get(i) < 10) {
                System.out.print("\t0" + winningNumbers.get(i));
            } else {
                System.out.print("\t" + winningNumbers.get(i));
            }
            if (i != winningNumbers.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("\n\n[내 로또 결과]");
        for (Map.Entry<Character, List<Integer>> lottos : map.entrySet()) {
            System.out.print(lottos.getKey() + "\t");

            int winningNumberCount = 0;
            for (int i = 0; i < winningNumbers.size(); i++) {
                if (lottos.getValue().contains(winningNumbers.get(i))) {
                    winningNumberCount++;
                }
                if (lottos.getValue().get(i) < 10) {
                    System.out.print("0" + lottos.getValue().get(i));
                } else {
                    System.out.print(lottos.getValue().get(i));
                }
                if (i != lottos.getValue().size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.printf(" => %d개 일치\n", winningNumberCount);
        }
    }
}
