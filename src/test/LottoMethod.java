package test;

import java.util.*;

public class LottoMethod {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final Map<String, Integer> allMatchCount = new HashMap<>();

    static {
        allMatchCount.put("3", 0);
        allMatchCount.put("4", 0);
        allMatchCount.put("5", 0);
        allMatchCount.put("5보너스", 0);
        allMatchCount.put("6", 0);
    }

    public static void main(String[] args) {
        int buyCountNumber = divideInputAmount(changeInputAmountType(inputBuyAmount()));
        printBuyCountNumber(buyCountNumber); // 몇개 구매 했는지 출력
        for (List<Integer> lottosTicket : createLottoTickets(buyCountNumber)) { // 로또 표 출력
            System.out.println(lottosTicket);
        }
        List<Integer> winningNumbers = changeWinningNumberType(divideInputWinningNumber(inputWinningNumber())); // 로또 당첨 번호
        String bonusNumber = inputBonusNumber();
        printWinningStatistics(); // 당첨 통계
        printMatchCountMatchLottoCount(compareLottoNumbers(createLottoTickets(buyCountNumber), winningNumbers, bonusNumber));
        printTotalYieldRate(allMatchCount, buyCountNumber);
    }

    public static String inputBuyAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return SCANNER.nextLine();
    }

    public static int changeInputAmountType(String buyAmount) {
        return Integer.parseInt(buyAmount);
    }

    public static int divideInputAmount(int buyAmount) {
        return buyAmount / 1000;
    }

    public static void printBuyCountNumber(int buyCountNumber) {
        System.out.println();
        System.out.println(buyCountNumber + "개를 구매했습니다.");
    }

    public static List<List<Integer>> createLottoTickets(int buyCountNumber) {
        List<List<Integer>> lottoNumbersTicket = new ArrayList<>();
        for (int i = 0; i < buyCountNumber; i++) {
            lottoNumbersTicket.add(createLottoRandomNumbers());
        }
        return lottoNumbersTicket;
    }

    public static List<Integer> createLottoRandomNumbers() {
        Set<Integer> tempLottoNumbers = new LinkedHashSet<>();
        while (tempLottoNumbers.size() != 6) {
            tempLottoNumbers.add(RANDOM.nextInt(46) + 1);
        }
        List<Integer> lottoNumber = new ArrayList<>(tempLottoNumbers);
        Collections.sort(lottoNumber);
        return lottoNumber;
    }

    public static String inputWinningNumber() {
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
        return SCANNER.nextLine();
    }

    public static List<String> divideInputWinningNumber(String winningNumber) {
        return List.of(winningNumber.split(","));
    }

    public static List<Integer> changeWinningNumberType(List<String> tempWinningNumbers) {
        List<Integer> winningNumbers = new ArrayList<>();
        for (String winningNumber : tempWinningNumbers) {
            winningNumbers.add(Integer.parseInt(winningNumber));
        }
        return winningNumbers;
    }

    public static String inputBonusNumber() {
        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
        return SCANNER.next();
    }

    public static void printWinningStatistics() {
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
    }

    public static Map<String, Integer> compareLottoNumbers(List<List<Integer>> lottosTicket, List<Integer> winningNumbers, String bonusNumber) {
        Map<String, Integer> allMatchCounts = allMatchCount;
        for (List<Integer> lottoTicket : lottosTicket) {
            allMatchCounts = findMatchCount(lottoTicket, winningNumbers, bonusNumber);
        }
        return allMatchCounts;
    }

    public static Map<String, Integer> findMatchCount(List<Integer> lottoTicket, List<Integer> winningNumbers, String bonusNumber) {
        Map<String, Integer> allMatchCounts = allMatchCount;

        int matchCount = 0;
        int matchLottoCount = 0;
        for (int i = 0; i < lottoTicket.size(); i++) {
            allMatchCounts = findWinningNumber(lottoTicket, winningNumbers, bonusNumber, i, matchCount, matchLottoCount);
        }
        return allMatchCounts;
    }

    public static Map<String, Integer> findWinningNumber(List<Integer> lottoTicket, List<Integer> winningNumbers, String bonusNumber,
                                                         int i, int matchCount, int matchLottoCount) {
        Map<String, Integer> allMatchCounts = allMatchCount;
        if (lottoTicket.get(i).equals(winningNumbers.get(i))) {
            matchCount++;
            if (matchCount == 3) {
                matchLottoCount++;
                allMatchCounts.put("3", matchLottoCount);
            }
            if (matchCount == 4) {
                matchLottoCount++;
                allMatchCounts.put("4", matchLottoCount);
            }
            if (matchCount == 5) {
                if (bonusNumber.contains(lottoTicket.toString())) {
                    matchLottoCount++;
                    allMatchCounts.put("5보너스", matchLottoCount);
                }
                matchLottoCount++;
                allMatchCounts.put("5", matchLottoCount);
            }
            if (matchCount == 6) {
                matchLottoCount++;
                allMatchCounts.put("6", matchLottoCount);
            }
        }
        return allMatchCounts;
    }

    public static void printMatchCountMatchLottoCount(Map<String, Integer> allMatchCounts) {
        System.out.println("3개 일치 (5,000원) - " + allMatchCounts.get("3") + "개");
        System.out.println("4개 일치 (50,000원) - " + allMatchCounts.get("4") + "개");
        System.out.println("5개 일치 (1,500,000원) - " + allMatchCounts.get("5") + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + allMatchCounts.get("5보너스") + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + allMatchCounts.get("6") + "개");
    }

    public static void printTotalYieldRate(Map<String, Integer> allMatchCounts, int buyCountNumber) {
        int total = 0;
        if (allMatchCounts.get("3") > 0) {
            total += allMatchCounts.get("3") * 5_000;
        }
        if (allMatchCounts.get("4") > 0) {
            total += allMatchCounts.get("4") * 50_000;
        }
        if (allMatchCounts.get("5") > 0) {
            total += allMatchCounts.get("5") * 1_500_000;
        }
        if (allMatchCounts.get("5보너스") > 0) {
            total += allMatchCounts.get("5보너스") * 30_000_000;
        }
        if (allMatchCounts.get("6") > 0) {
            total += allMatchCounts.get("6") * 2_000_000_000;
        }
        System.out.println("총 수익률은 " + (total / (buyCountNumber * 1000)) * 100 + "입니다."); //수익률 = (당첨금액 / 구입금액) * 100
    }

}
