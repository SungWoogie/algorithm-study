package study;

import java.util.*;

public class Lotto1 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("구입금액을 입력해 주세요.");
        int inputMoney = SCANNER.nextInt(); // 8000
        int purchaseMoney = inputMoney / 1_000;

        System.out.println(); // 줄 띄움
        System.out.println(purchaseMoney + "개를 구매했습니다.");

        Random random = new Random();
        List<List<Integer>> lottoLottoNumbers = new ArrayList<>(); // 랜덤 숫자
        List<Integer> winningNumbers = new ArrayList<>(); // 당첨 번호
        int bonusNumber;
        for (int i = 0; i < purchaseMoney; i++) {
            Set<Integer> tempLottoNumbers = new LinkedHashSet<>();
            while (tempLottoNumbers.size() != 6) {
                tempLottoNumbers.add(random.nextInt(45) + 1);
            }
            List<Integer> tempList = new ArrayList<>(tempLottoNumbers);
            Collections.sort(tempList);

            lottoLottoNumbers.add(tempList);
        }
        for (List<Integer> num : lottoLottoNumbers) {
            System.out.println(num);
        }

        System.out.println();

        printWinningNumber(winningNumbers);

        System.out.println("보너스 번호를 입력해 주세요.");
        bonusNumber = SCANNER.nextInt();

        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
        List<Integer> prizeCountList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            prizeCountList.add(0);
        }
        int total = 0;
        for (int i = 0; i < purchaseMoney; i++) {
            int matchCount = 0; // 몇개 맞는지
            boolean asd = false;
            for (int j = 0; j < lottoLottoNumbers.get(i).size(); j++) { //로또넘버를 하나씩 꺼낸다.
                for (int k = 0; k < lottoLottoNumbers.get(i).size(); k++) { //위닝번호를 순서대로 꺼낸다.
                    if (lottoLottoNumbers.get(i).get(j).equals(winningNumbers.get(k))) { //로또넘버를 두고 위닝넘버를 하나씩 비교한다.
                        matchCount++;
                    }
                }
                if (lottoLottoNumbers.get(i).get(j).equals(bonusNumber)) { //로또넘버를 하나씩 다시 꺼내서 보너스볼 일치 여부 확인
                    asd = true;
                }
            }
            System.out.println(matchCount);

            if (matchCount == 3) {
                prizeCountList.set(0, prizeCountList.get(0) + 1);
            } else if (matchCount == 4) {
                prizeCountList.set(1, prizeCountList.get(1) + 1);
            } else if (matchCount == 5 && asd) {
                prizeCountList.set(3, prizeCountList.get(3) + 1);
            } else if (matchCount == 5) {
                prizeCountList.set(2, prizeCountList.get(2) + 1);
            } else if (matchCount == 6) {
                prizeCountList.set(4, prizeCountList.get(4) + 1);
            }
        }
        printMatchResult(prizeCountList);
        double result = (double) total / purchaseMoney;
        System.out.printf("%.2f%n", result);
    }

    public static void printWinningNumber(List<Integer> winningNumbers) {
        System.out.println("당첨 번호를 입력해 주세요.");
        String[] winningNumber = SCANNER.next().split(",");
        for (String winning : winningNumber) {
            winningNumbers.add(Integer.parseInt(winning));
        }
        System.out.println(); // 줄 띄움
    }

    public static void printMatchResult(List<Integer> a) {
        System.out.println("3개 일치 (5,000원) - " + a.get(0) + "개");
        System.out.println("4개 일치 (50,000원) - " + a.get(1) + "개");
        System.out.println("5개 일치 (1,500,000원) - " + a.get(2) + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + a.get(3) + "개");
        System.out.println("6개 일치 (1,500,000원) - " + a.get(4) + "개");
    }
}
