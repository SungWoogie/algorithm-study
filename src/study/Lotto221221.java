package study;

import java.util.*;

public class Lotto221221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");
        int buyMoney = scanner.nextInt();

        System.out.println();
        int lottoCount = buyMoney / 1_000;
        System.out.println(lottoCount + "개를 구매했습니다.");

        List<List<Integer>> lottoTicket = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < lottoCount; i++) {
            Set<Integer> tempLottos = new LinkedHashSet<>(); // 중복 막기 위해 Set
            while (tempLottos.size() != 6) {
                tempLottos.add(random.nextInt(45) + 1);
            }
            List<Integer> lottos = new ArrayList<>(tempLottos); // Set -> List 로 저장

            Collections.sort(lottos); // 오름차순으로 정렬
            lottoTicket.add(lottos);
            System.out.println(lottoTicket.get(i)); // Ticket 출력
        }

        System.out.println("---------");
        List<List<Integer>> lottoTicketAsd = new ArrayList<>();

        for (int i = 0; i < lottoCount; i++) {
            List<Integer> lottosAsd = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                lottosAsd.add(random.nextInt(45) + 1);
            }
            Collections.sort(lottosAsd);
            lottoTicketAsd.add(lottosAsd);
            lottosAsd.clear();
            System.out.println(lottoTicketAsd.get(i));
        }
        System.out.println("----------");


        List<Integer> winningNumbers = new ArrayList<>(); // 당첨 번호 저장소
        System.out.println();
        System.out.println("당첨 번호를 입력해 주세요.");
        String inputWinningNumber = scanner.next();

        String[] splitWinningNumber = inputWinningNumber.split(","); // split 하기 위해 String 배열 생성
        for (String winningNumber : splitWinningNumber) {
            winningNumbers.add(Integer.parseInt(winningNumber));
        }

        System.out.println();
        System.out.println("보너스 번호를 입력해 주세요.");
        int bonusNumber = scanner.nextInt(); // 보너스 번호

        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---");
//        Map<Integer, Boolean> winningTicket = new LinkedHashMap<>();
        int matchCountThird = 0;
        int matchCountFourth = 0;
        int matchCountFifth = 0;
        int matchCountFifthHasBonusNumber = 0;
        int matchCountSixth = 0;
        int bonusCount = 0;
        for (int i = 0; i < lottoTicket.size(); i++) {
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (winningNumbers.contains(lottoTicket.get(i).get(j))) {
                    count++;
                    if (count == 5) {
                        if (lottoTicket.get(i).contains(bonusNumber)) {
                            bonusCount++;
                        }
                    }
                }
            }

            if (count == 3) {
                matchCountThird++;
            } else if (count == 4) {
                matchCountFourth++;
            } else if (count == 5 && bonusCount == 1) {
                matchCountFifthHasBonusNumber++;
            } else if (count == 5 && bonusCount == 0) {
                matchCountFifth++;
            } else if (count == 6) {
                matchCountSixth++;
            }
        }

        int sum = 0;
        if (matchCountThird > 0) {
            sum += 5_000 * matchCountThird;
        }
        if (matchCountFourth > 0) {
            sum += 50_000 * matchCountFourth;
        }
        if (matchCountFifth > 0) {
            sum += 1_500_000 * matchCountFifth;
        }
        if (matchCountFifthHasBonusNumber > 0) {
            sum += 30_000_000 * matchCountFifthHasBonusNumber;
        }
        if (matchCountSixth > 0) {
            sum += 2_000_000_000 * matchCountSixth;
        }

        double profitRate = ((double) sum / buyMoney) * 100;
        System.out.println(sum);

        System.out.println("3개 일치 (5,000원) - " + matchCountThird + "개");
        System.out.println("4개 일치 (50,000원) - " + matchCountFourth + "개");
        System.out.println("5개 일치 (1,500,000원) - " + matchCountFifth + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + matchCountFifthHasBonusNumber + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + matchCountSixth + "개");
        System.out.println("총 수익률은 " + profitRate + "%입니다.");

    }

//    public static void printResult(int count, double profitRate, int bonusCount) {
//        if (count == 3) {
//            System.out.println("3개 일치 (5,000원) - " + count + "개");
//        } else if (count == 4) {
//            System.out.println("4개 일치 (50,000원) - " + count + "개");
//        } else if (count == 5) {
//            if (bonusCount == 1) {
//                System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + count + "개");
//            }
//            System.out.println("5개 일치 (1,500,000원) - " + count + "개");
//        } else if (count == 6) {
//            System.out.println("6개 일치 (2,000,000,000원) - " + count + "개");
//        }
//        System.out.println("총 수익률은 " + profitRate + "%입니다.");
//    }
}
