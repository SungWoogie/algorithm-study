//package test;
//
//import java.util.*;
//
//public class Test {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private static final Random RANDOM = new Random();
//
//    // 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규
//
//    //    (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위
//    public static void main(String[] args) {
//        Map<String, List<String>> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < 6; i++) {
//            List<String> list = new ArrayList<>(); // 프로필 만드는 곳
//            list.add(SCANNER.next()); // 랭크 0
//            list.add("일반선수"); // 1
//            list.add(String.valueOf(RANDOM.nextInt(6) + 1)); // 주사위 2
//            list.add(String.valueOf(RANDOM.nextInt(3) + 1)); // 등급 3
//            map.put(list.get(0), list);
//        }
//        System.out.println(map);
//
//
//        Set<String> tempDiceNumbers = new LinkedHashSet<>(); // 중복 없애기 위함
//        Set<String> tempRatings = new LinkedHashSet<>(); // 중복 없애기 위함
//        for (Map.Entry<String, List<String>> ATeam : map.entrySet()) {
//            tempDiceNumbers.add(ATeam.getValue().get(2));
//            tempRatings.add(ATeam.getValue().get(3));
//        }
//        List<String> diceNumbers = new ArrayList<>(tempDiceNumbers);
//        List<String> ratings = new ArrayList<>(tempRatings);
//
//        diceNumbers.sort(Collections.reverseOrder());
//        ratings.sort(Collections.reverseOrder());
//
//        String firstMaxDiceNumber = diceNumbers.get(0); // 첫번째 주사위 가장 큰 수
//
//        String firstMaxRating = ratings.get(0); // 랭킹 가장 큰 수
//        String secondMaxRating = ratings.get(1); // 랭킹 두번째 큰 수
//        String thirdMaxRating = ratings.get(2); // 랭킹 세번째 큰수
//
//        int diceCount = 0;
//        int ratingCount = 0;
//
//
//        boolean isFindForward = true;
//        while (isFindForward) { // 공격수를 찾아라
//            for (int i = 0; i < diceNumbers.size(); i++) {
//
//            }
//
//
//            for (Map.Entry<String, List<String>> ATeam : map.entrySet()) {
//                if (diceNumbers.get(i).equals(ATeam.getValue().get(2))) { // 주사위 숫자가 제일 큰 사람이 몇명인지 확인한다.
//                    diceCount++;
//                }
//                if (diceCount == 2) { // 주사위 숫자가 두명이면 그 두명 공격수로 선정한다.
//                    ATeam.getValue().set(1, "공격수");
//
//                }
//                if (diceCount == 1) { // 주사위 숫자가 높은 값이 한명이면 그 한명 공격수로 선정한다.
//                    ATeam.getValue().set(1, "공격수");
//                    if () { // 그 다음 주사위 높은 값이 한명이냐
//                    }
//
//                }
//                if (diceCount > 2) { // 주사위 숫자가 두명 보다 크다면 내려가라
//                    if (diceNumbers.get(i).equals(ATeam.getValue().get(3))) { // 랭크 점수가 제일 큰 사람이 몇명인지 확인한다.
//                        ratingCount++;
//                    }
//                    if (ratingCount == 2) { // 랭크 점수가 제일 큰 사람이 두명이면 그 두명 공격수로 선정한다.
//                        ATeam.getValue().set(1, "공격수");
//                    }
//                    if (ratingCount == 1) { // 랭크 점수 높은 사람이 한명이냐
//                        if (firstMaxRating.equals(ATeam.getValue().get(3))) { // 랭크 제일 높은 사람이랑 값이 같냐 그 사람 공격수
//                            ATeam.getValue().set(1, "공격수");
//                        }
//
//                    }
//
//                }
//            }
//
//}
//        }
//
//
//    }
//}