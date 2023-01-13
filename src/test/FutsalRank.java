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
            playersProfile.add(String.valueOf(RANDOM.nextInt(6) + 1));
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
        Map<String, List<String>> ATeams = new LinkedHashMap<>();
        Map<String, List<String>> BTeams = new LinkedHashMap<>();
        while (teamSelection) {
            Map<String, List<String>> tempAllPlayersStorage = new HashMap<>(allPlayersStorage);
            int ATeamRankScore = 0;
            int BTeamRankScore = 0;
            for (Map.Entry<String, List<String>> tempAllPlayer : tempAllPlayersStorage.entrySet()) {
                if (BTeams.size() < 6) {
                    BTeams.put(tempAllPlayer.getKey(), tempAllPlayer.getValue());
                    allPlayersStorage.remove(tempAllPlayer.getKey(), tempAllPlayer.getValue());
                    ATeams = allPlayersStorage;
                }
            }
            // A 팀 랭크 스코어 합산 구하기
            for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
                if (ATeam.getValue().get(0).equals("A")) {
                    ATeamRankScore += 3;
                } else if (ATeam.getValue().get(0).equals("B")) {
                    ATeamRankScore += 2;
                } else {
                    ATeamRankScore += 1;
                }
            }
            // B 팀 랭크 스코어 합산 구하기
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
                tempAllPlayersStorage.clear();
            }
            System.out.println("A 팀 랭크 스코어 합계 : " + ATeamRankScore);
            System.out.println("B 팀 랭크 스코어 합계 : " + BTeamRankScore + "\n");
            System.out.println("A 팀 공격수 만들기 전 : " + ATeams);
            System.out.println("B 팀 공격수 만들기 전 : " + BTeams + "\n");
        }
        // 여기 부터는 A 팀
        // A 팀 주사위 높은 순으로 공격수
        Set<Integer> tempATeamDices = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            tempATeamDices.add(Integer.parseInt(ATeam.getValue().get(2))); // 주사위를 인티저로 저장
        }
        List<Integer> ATeamDices = new ArrayList<>(tempATeamDices);
        Collections.sort(ATeamDices); // 최대 주사위 값 구하기

        // 랭크 점수 인티저로 바꿔서 저장하고 정렬하기
        Set<Integer> tempATeamRankScore = new LinkedHashSet<>(); // 랭크 점수 3, 2, 1
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            tempATeamRankScore.add(Integer.parseInt(ATeam.getValue().get(3)));
        }
        List<Integer> ATeamRankScore = new ArrayList<>(tempATeamRankScore);
        Collections.sort(ATeamRankScore); // 최대 랭크 구하기

        // TODO - Map 안에 List 에 저장되어 있는 Profile (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위)
        String ATeamFirstDiceNumber = String.valueOf(ATeamDices.get(ATeamDices.size() - 1)); // 제일 높은 첫번째 주사위 값
        String ATeamSecondDiceNumber = String.valueOf(ATeamDices.get(ATeamDices.size() - 2)); // 다음으로 높은 주사위 값
        String ATeamFirstRankScore = String.valueOf(ATeamRankScore.get(ATeamRankScore.size() - 1)); // 제일 높은 랭크 값
        String ATeamSecondRankScore = String.valueOf(ATeamRankScore.get(ATeamRankScore.size() - 2)); // 제일 높은 랭크 값
        String ATeamThirdRankScore = String.valueOf(ATeamRankScore.get(ATeamRankScore.size() - 3)); // 제일 높은 랭크 값

        int ATeamFirstDiceEqualCount = 0;
        int ATeamSecondDiceEqualCount = 0;
        int ATeamFirstRankEqualCount = 0;
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            if (ATeam.getValue().get(2).contains(ATeamFirstDiceNumber)) { // 제일 높은 주사위 숫자 같은게 있냐
                ATeamFirstDiceEqualCount++;
            }
            if (ATeam.getValue().get(2).contains(ATeamSecondDiceNumber)) { // 두번째 높은 주사위랑 같은거 있냐
                ATeamSecondDiceEqualCount++;
            }
            if (ATeam.getValue().get(3).contains(ATeamFirstRankScore)) { // 제일 높은 랭크와 같은게 있냐
                ATeamFirstRankEqualCount++;
            }
        }

        int ATeamFirstCount = 0;
        int ATeamSecondCount = 0;
        if (ATeamFirstDiceEqualCount == 2) { // 첫번째 주사위 같은 숫자가 2명이냐
            for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
                if (ATeam.getValue().get(2).equals(ATeamFirstDiceNumber)) { // 첫번째 주사위 숫자랑 같은 놈을 공격수로 바꿔라
                    ATeam.getValue().set(1, "공격수");
                }
            }
        } else if (ATeamFirstDiceEqualCount >= 3) { // 아니면 첫번째 주사위와 같은 값이 3명 이상이냐
            if (ATeamFirstRankEqualCount >= 3) { // 혹시 랭크 높은 값도 3명 이상이냐
                for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
                    if (ATeam.getValue().get(2).equals(ATeamFirstDiceNumber)) {
                        ATeam.getValue().set(1, "공격수");
                        ATeamFirstCount++;
                    }
                    if (ATeamFirstCount == 2) { // 그러면 사전순으로 2명 공격수로 바꾸고 멈춰라
                        break;
                    }
                }
            }
        } else if (ATeamFirstDiceEqualCount == 1) { // 아니면 첫번째로 높은 숫자가 1명이냐
            for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
                if (ATeam.getValue().get(2).equals(ATeamFirstDiceNumber)) { // 그러면 그 1명 만 이 값이랑 같으면 공격수로 바꿔라
                    ATeam.getValue().set(1, "공격수");
                }
                if (ATeamSecondDiceEqualCount >= 3) { // 그리고 다음으로 높은 숫자가 3명 이상이냐?
                    if (ATeam.getValue().get(2).equals(ATeamSecondDiceNumber)) { // 다음 높은 숫자중에 1명 바꾸고 멈춰라
                        ATeam.getValue().set(1, "공격수");
                        ATeamSecondCount++;
                    }
                    if (ATeamSecondCount == 1) {
                        break;
                    }
                } else if (ATeamSecondDiceEqualCount == 1) { // 아니면 다음으로 높은 숫자가 1명이냐?
                    if (ATeam.getValue().get(2).equals(ATeamSecondDiceNumber)) { // 그럼 그냥 바꾸고 멈춰라
                        ATeam.getValue().set(1, "공격수");
                        break;
                    }
                } else if (ATeamSecondDiceEqualCount > 1) { // 아니면 1명 이상이냐 ??
                    if (ATeam.getValue().get(2).equals(ATeamSecondRankScore)) {
                        ATeam.getValue().set(1, "공격수");
                        break;
                    } else if (ATeam.getValue().get(2).equals(ATeamThirdRankScore)) {
                        ATeam.getValue().set(1, "공격수");
                        break;
                    }
                }
            }
        }

        // TODO - Map 안에 List 에 저장되어 있는 Profile (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위)
        // TODO - 여기서 부터는 B 팀 관련
        // B 팀 주사위 높은 순으로 공격수
        Set<Integer> tempBTeamDices = new LinkedHashSet<>();
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            tempBTeamDices.add(Integer.parseInt(BTeam.getValue().get(2))); // 주사위를 인티저로 저장
        }
        List<Integer> BTeamDices = new ArrayList<>(tempBTeamDices);
        Collections.sort(BTeamDices); // 최대 주사위 값 구하기

        // 랭크 점수 인티저로 바꿔서 저장하고 정렬하기
        Set<Integer> tempBTeamRankScore = new LinkedHashSet<>(); // 랭크 점수 3, 2, 1
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            tempBTeamRankScore.add(Integer.parseInt(BTeam.getValue().get(3)));
        }
        List<Integer> BTeamRankScore = new ArrayList<>(tempBTeamRankScore);
        Collections.sort(BTeamRankScore); // 최대 랭크 구하기

        //////////////////////////////////////////
        // TODO - Map 안에 List 에 저장되어 있는 Profile (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위)
        String BTeamFirstDiceNumber = String.valueOf(BTeamDices.get(BTeamDices.size() - 1)); // 제일 높은 첫번째 주사위 값
        String BTeamSecondDiceNumber = String.valueOf(BTeamDices.get(BTeamDices.size() - 2)); // 다음으로 높은 주사위 값
        String BTeamFirstRankScore = String.valueOf(BTeamRankScore.get(BTeamRankScore.size() - 1)); // 제일 높은 랭크 값
        String BTeamSecondRankScore = String.valueOf(BTeamRankScore.get(BTeamRankScore.size() - 2)); // 제일 높은 랭크 값
        String BTeamThirdRankScore = String.valueOf(BTeamRankScore.get(BTeamRankScore.size() - 3)); // 제일 높은 랭크 값

        int BTeamFirstDiceEqualCount = 0;
        int BTeamSecondDiceEqualCount = 0;
        int BTeamFirstRankEqualCount = 0;
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (BTeam.getValue().get(2).contains(BTeamFirstDiceNumber)) { // 제일 높은 주사위 숫자 같은게 있냐
                BTeamFirstDiceEqualCount++;
            }
            if (BTeam.getValue().get(2).contains(BTeamSecondDiceNumber)) { // 두번째 높은 주사위랑 같은거 있냐
                BTeamSecondDiceEqualCount++;
            }
            if (BTeam.getValue().get(3).contains(BTeamFirstRankScore)) { // 제일 높은 랭크와 같은게 있냐
                BTeamFirstRankEqualCount++;
            }
        }

        int BTeamFirstCount = 0;
        int BTeamSecondCount = 0;
        if (BTeamFirstDiceEqualCount == 2) { // 첫번째 주사위 같은 숫자가 2명이냐
            for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
                if (BTeam.getValue().get(2).equals(BTeamFirstDiceNumber)) { // 첫번째 주사위 숫자랑 같은 놈을 공격수로 바꿔라
                    BTeam.getValue().set(1, "공격수");
                }
            }
        } else if (BTeamFirstDiceEqualCount >= 3) { // 아니면 첫번째 주사위와 같은 값이 3명 이상이냐
            if (BTeamFirstRankEqualCount >= 3) { // 혹시 랭크 높은 값도 3명 이상이냐
                for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
                    if (BTeam.getValue().get(2).equals(BTeamFirstDiceNumber)) {
                        BTeam.getValue().set(1, "공격수");
                        BTeamFirstCount++;
                    }
                    if (BTeamFirstCount == 2) { // 그러면 사전순으로 2명 공격수로 바꾸고 멈춰라
                        break;
                    }
                }
            }
        } else if (BTeamFirstDiceEqualCount == 1) { // 아니면 첫번째로 높은 숫자가 1명이냐
            for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
                if (BTeam.getValue().get(2).equals(BTeamFirstDiceNumber)) { // 그러면 그 1명 만 이 값이랑 같으면 공격수로 바꿔라
                    BTeam.getValue().set(1, "공격수");
                }
                if (BTeamSecondDiceEqualCount >= 3) { // 그리고 다음으로 높은 숫자가 3명 이상이냐?
                    if (BTeam.getValue().get(2).equals(BTeamSecondDiceNumber)) { // 다음 높은 숫자중에 1명 바꾸고 멈춰라
                        BTeam.getValue().set(1, "공격수");
                        BTeamSecondCount++;
                    }
                    if (BTeamSecondCount == 1) {
                        break;
                    }
                } else if (BTeamSecondDiceEqualCount == 1) { // 아니면 다음으로 높은 숫자가 1명이냐?
                    if (BTeam.getValue().get(2).equals(BTeamSecondDiceNumber)) { // 그럼 그냥 바꾸고 멈춰라
                        BTeam.getValue().set(1, "공격수");
                        break;
                    }
                } else if (BTeamSecondDiceEqualCount > 1) { // 아니면 1명 이상이냐 ??
                    if (BTeam.getValue().get(2).equals(BTeamSecondRankScore)) {
                        BTeam.getValue().set(1, "공격수");
                        break;
                    } else if (BTeam.getValue().get(2).equals(BTeamThirdRankScore)) {
                        BTeam.getValue().set(1, "공격수");
                        break;
                    }
                }
            }
        }
        System.out.println("A 팀 공격수 선정 : " + ATeams);
        System.out.println("B 팀 공격수 선정 : " + BTeams + "\n");

        // 공격수들만 저장하기 순차적으로 나오면 안되어 Set 에 담기
        // TODO - Map 안에 List 에 저장되어 있는 Profile (0번째는 알파벳 랭크, 1번째는 공격수 여부, 2번째 주사위, 3번째 랭크 우선 순위)
        Set<String> forwards = new HashSet<>();
        for (Map.Entry<String, List<String>> AForward : ATeams.entrySet()) {
            if (AForward.getValue().get(1).equals("공격수")) {
                forwards.add(AForward.getKey());
            }
        }
        for (Map.Entry<String, List<String>> BForward : BTeams.entrySet()) {
            if (BForward.getValue().get(1).equals("공격수")) {
                forwards.add(BForward.getKey());
            }
        }

        int ATeamScore = 0;
        int BTeamScore = 0;
        for (String forward : forwards) { // 출력 랜덤 5 이상이면 득점 부분 출력
            int goal = RANDOM.nextInt(10) + 1;
            if (ATeams.containsKey(forward)) {
                if (goal > 5) {
                    ATeamScore++;
                    System.out.println(forward + " : A 팀 공격수 득점에 성공하였습니다." + "\n");
                } else {
                    System.out.println(forward + " : A 팀 공격수 어림 없는 볼." + "\n");
                }
            } else {
                if (goal > 5) {
                    BTeamScore++;
                    System.out.println(forward + ": B 팀 공격수 득점에 성공하였습니다." + "\n");
                } else {
                    System.out.println(forward + " : B 팀 공격수 어림 없는 볼." + "\n");
                }
            }
        }

        if (ATeamScore > BTeamScore) { // 결과
            System.out.println("A 팀이 " + ATeamScore + " 대 " + BTeamScore + " 으로 이겼습니다.");
        } else if (ATeamScore < BTeamScore) {
            System.out.println("B 팀이 " + BTeamScore + " 대 " + ATeamScore + " 으로 이겼습니다.");
        } else {
            System.out.println(ATeamScore + " 대 " + BTeamScore + " 으로 비겼습니다.");
        }
    }
}


