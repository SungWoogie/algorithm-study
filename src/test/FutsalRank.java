package test;

import java.util.*;

public class FutsalRank {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("풋살에 참가할 참가자 이름을 입력해주세요.");
        List<String> players = new ArrayList<>(List.of(SCANNER.nextLine().split(" ")));
        Collections.shuffle(players);

        System.out.println();
        System.out.println("--------------- 참가하기로 한 명단 ---------------");
        System.out.println(players + "\n");

        // 모든 인원 랭크랑 일반 선수로 지정하고 Map 에 저장하기
        Map<String, List<String>> allPlayersStorage = new HashMap<>();
        for (String player : players) {
            List<String> playersProfile = new ArrayList<>(); // 랭크, 선수직책, 주사위 숫자, 기준 숫자
            System.out.print(player + " 랭크 입력 : ");
            playersProfile.add(SCANNER.next());
            playersProfile.add("일반선수");
            playersProfile.add(String.valueOf(RANDOM.nextInt(10) + 1));
            if (playersProfile.get(0).equals("A")) {
                playersProfile.add("3");
            } else if (playersProfile.get(0).equals("B")) {
                playersProfile.add("2");
            } else {
                playersProfile.add("1");
            }
            allPlayersStorage.put(player, playersProfile);
        }

        // 랭크 모두 더한 값 구해야함 그래야 몇 차이 날지 확인 가능
        int totalRankScore = 0;
        for (Map.Entry<String, List<String>> rank : allPlayersStorage.entrySet()) {
            if (rank.getValue().get(0).equals("A")) {
                totalRankScore += 3;
            } else if (rank.getValue().get(0).equals("B")) {
                totalRankScore += 2;
            } else {
                totalRankScore += 1;
            }
        }
        System.out.println("양팀 합산 랭크 스코어 확인 : " + totalRankScore);
        // 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규
        // 랭크에 맞게 팀 선정, +- 2 이하인지 확인
        boolean teamSelection = true;
        Map<String, List<String>> ATeams = new HashMap<>();
        Map<String, List<String>> BTeams = new HashMap<>();
        while (teamSelection) {
            Map<String, List<String>> tempAllPlayersStorage = new HashMap<>(allPlayersStorage);
            System.out.println("값 이있냐? : " + tempAllPlayersStorage);
            int ATeamRankScore = 0;
            int BTeamRankScore = 0;
            for (Map.Entry<String, List<String>> allPlayer : allPlayersStorage.entrySet()) {
                if (BTeams.size() < 6) {
                    BTeams.put(allPlayer.getKey(), allPlayer.getValue());
                    tempAllPlayersStorage.remove(allPlayer.getKey(), allPlayer.getValue());
                    ATeams = tempAllPlayersStorage;
                }
            }
            for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
                if (ATeam.getValue().get(0).equals("A")) {
                    ATeamRankScore += 3;
                } else if (ATeam.getValue().get(0).equals("B")) {
                    ATeamRankScore += 2;
                } else {
                    ATeamRankScore += 1;
                }
            }
            for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
                if (BTeam.getValue().get(0).equals("A")) {
                    BTeamRankScore += 3;
                } else if (BTeam.getValue().get(0).equals("B")) {
                    BTeamRankScore += 2;
                } else {
                    BTeamRankScore += 1;
                }
            }
            if (ATeamRankScore == BTeamRankScore) {
                teamSelection = false;
            } else if (ATeamRankScore > BTeamRankScore && ATeamRankScore - BTeamRankScore == 1 || ATeamRankScore - BTeamRankScore == 2) {
                teamSelection = false;
            } else if (BTeamRankScore > ATeamRankScore && BTeamRankScore - ATeamRankScore == 1 || BTeamRankScore - ATeamRankScore == 2) {
                teamSelection = false;
            } else {
                ATeams.clear();
                BTeams.clear();
            }
            System.out.println("A 팀 스코어 : " + ATeamRankScore);
            System.out.println("B 팀 스코어 : " + BTeamRankScore + "\n");
            System.out.println("A 팀 공격수 만들기 전 : " + ATeams);
            System.out.println("B 팀 공격수 만들기 전 : " + BTeams + "\n");
        }

        // 위에서 주사위 굴려서 주사위 높은 사람 A 팀 공격수 선정
        List<Integer> ATeamDices = new ArrayList<>();
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            ATeamDices.add(Integer.parseInt(ATeam.getValue().get(2))); // 주사위를 인티저로 저장
        }
        Collections.sort(ATeamDices);
        String ATeamFirstForward = String.valueOf(ATeamDices.get(ATeamDices.size() - 1));
        String ATeamSecondForward = String.valueOf(ATeamDices.get(ATeamDices.size() - 2));
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) { // 공격수로 바꾸기
            if (ATeam.getValue().get(2).equals(ATeamFirstForward)) {
                ATeam.getValue().set(1, "공격수");
            }
            if (ATeam.getValue().get(2).equals(ATeamSecondForward)) {
                ATeam.getValue().set(1, "공격수");
            }
        }
        // TODO - Map 안에 List 에 저장되어 있는 Profile (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위)

        // 랭크 점수 인티저로 바꿔서 저장하고 정렬하기
        List<Integer> ATeamRankScore = new ArrayList<>(); // 랭크 점수 3, 2, 1
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            ATeamRankScore.add(Integer.parseInt(ATeam.getValue().get(3)));
        }
        Collections.sort(ATeamRankScore);
        // abc 랭킹 정하기
        List<String> ATeamRanking = new ArrayList<>(); // A, B, C 사전순 정렬 Collections.sort 가능
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            ATeamRanking.add(ATeam.getValue().get(0));
        }
        Collections.sort(ATeamRanking);

        // 공격수인지 찾고 공격수인 애들만 저장하고 그들중 랭크 점수 제일 높은애 찾기
        Map<String, List<String>> tempATeamForwards = new HashMap<>();
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            if (ATeam.getValue().contains("공격수")) { // 공격수 찾기
                tempATeamForwards.put(ATeam.getKey(), ATeam.getValue());
            }
        }
        int ATeamForwardNames = tempATeamForwards.size(); // 공격수가 두명 초과했냐 ?

        // 여기서 공격수가 3명 보다 크면 찾아야 된다.
        // TODO - 여기가 잘못됬음
        // TODO - 아까 코드 해놨다가 어디가 잘못된건지 찾아서 지우고 다시하는 중이였음
//        int max = 0;
//        String ATeamFirstName;
//        if (ATeamForwardNames >= 3) {
//            for (Map.Entry<String, List<String>> ATeam : tempATeamForwards.entrySet()) {
//                if (Integer.parseInt(ATeam.getValue().get(3)) > max) { // 랭크 점수 제일 높은애 찾아
//                    max = Integer.parseInt(ATeam.getValue().get(3));
//                }
//            }
//
//        }


        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            if (!ATeamForwardNames.contains(ATeam.getKey())) {
                ATeam.getValue().set(1, "일반선수");
                ATeams.put(ATeam.getKey(), ATeam.getValue());
            }
        }
        System.out.println("A 팀 공격수 적용 후 : " + ATeams + "\n");

        // TODO - 여기서 부터는 B 팀 관련 찾기 로직 위랑 동일

        List<Integer> BTeamDices = new ArrayList<>();
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            BTeamDices.add(Integer.parseInt(BTeam.getValue().get(2))); // 주사위를 인티저로 저장
        }
        Collections.sort(BTeamDices); // 주사위 오름차순
        String BTeamFirstForward = String.valueOf(BTeamDices.get(BTeamDices.size() - 1));
        String BTeamSecondForward = String.valueOf(BTeamDices.get(BTeamDices.size() - 2));
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (BTeam.getValue().get(2).equals(BTeamFirstForward)) {
                BTeam.getValue().set(1, "공격수");
            }
            if (BTeam.getValue().get(2).equals(BTeamSecondForward)) {
                BTeam.getValue().set(1, "공격수");
            }
        }
        List<Integer> BTeamRankScore = new ArrayList<>(); // 랭크 점수 3, 2, 1
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            BTeamRankScore.add(Integer.parseInt(BTeam.getValue().get(3)));
        }
        Collections.sort(BTeamRankScore);
        // abc 랭킹 정하기
        List<String> BTeamRanking = new ArrayList<>(); // A, B, C 사전순 정렬 Collections.sort 가능
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            BTeamRanking.add(BTeam.getValue().get(0));
        }
        Collections.sort(BTeamRanking);

        // 공격수인지 찾고 공격수인 애들만 저장하고 그들중 랭크 점수 제일 높은애 찾기
        Map<String, List<String>> tempBTeamForwards = new HashMap<>();
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (BTeam.getValue().contains("공격수")) { // 공격수 찾기
                tempBTeamForwards.put(BTeam.getKey(), BTeam.getValue());
            }
        }
        // 공격수만 뽑아놓고 조건에 해당하는 이름 리스트로 저장
        int BTeamCount = 0;
        Set<String> BTeamForwardNames = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> forward : tempBTeamForwards.entrySet()) {
            for (int i = 0; i < BTeamRanking.size(); i++) {
                if (forward.getValue().get(3).contains(String.valueOf(BTeamRankScore.get(i)))) {
                    if (forward.getValue().get(0).contains(BTeamRanking.get(i))) {
                        BTeamForwardNames.add(forward.getKey());
                        BTeamCount++;
                    }
                }
                if (BTeamCount == 2) {
                    break;
                }
            }
        }
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (!BTeamForwardNames.contains(BTeam.getKey())) {
                BTeam.getValue().set(1, "일반선수");
            }
        }
        System.out.println("A 팀 이름 리스트 확인 : " + ATeamForwardNames);
        System.out.println("B 팀 이름 리스트 확인 : " + BTeamForwardNames + "\n");


    }
}


