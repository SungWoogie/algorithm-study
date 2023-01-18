package test;

import java.util.*;

public class FutsalMethod {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<String> participationNames = inputFutsalParticipationNames();
        printParticipationList(participationNames);

        Map<String, List<String>> allPlayers = savePlayersProfile(participationNames);
        validateGrade(allPlayers);

        Map<String, List<String>> ATeamPlayers = new LinkedHashMap<>();
        Map<String, List<String>> BTeamsPlayers = new LinkedHashMap<>();

        boolean isTeamSelect = true;
        while (isTeamSelect) {
            Map<String, List<String>> tempAllPlayersStorage = new HashMap<>(allPlayers);
            ATeamPlayers = dividePlayersByATeam(tempAllPlayersStorage);
            BTeamsPlayers = dividePlayersByBTeam(tempAllPlayersStorage, ATeamPlayers);
            int ATeamRankTotalScore = findATeamRankTotalScore(ATeamPlayers);
            int BTeamRankTotalScore = findBTeamRankTotalScore(BTeamsPlayers);
            isTeamSelect = isHigherScoreTeam(ATeamRankTotalScore, BTeamRankTotalScore);
            isTeamSelect = isDeleteAllTeamsPlayers(isTeamSelect, ATeamPlayers, BTeamsPlayers);
            printAllTeamsScore(ATeamRankTotalScore, BTeamRankTotalScore);
            printATeamPlayerList(ATeamPlayers);
            printBTeamPlayerList(BTeamsPlayers);
        }
        List<String> ATeamForward = findATeamBestPlayer(ATeamPlayers);
        Map<String, List<String>> ATeamPlayer = addATeamForward(ATeamPlayers, ATeamForward);
        List<String> BTeamForward = findBTeamBestPlayer(BTeamsPlayers);
        Map<String, List<String>> BTeamPlayer = addBTeamForward(BTeamsPlayers, BTeamForward);
        printATeamPlayers(ATeamPlayer);
        printBTeamPlayers(BTeamPlayer);
    }

    public static List<String> inputFutsalParticipationNames() {
        System.out.println("풋살에 참가할 참가자 이름을 입력해주세요.");
        List<String> players = new ArrayList<>(List.of(SCANNER.nextLine().split(" ")));
        Collections.shuffle(players);
        return players;
    }

    public static void printParticipationList(List<String> players) {
        System.out.println("\n" + "-------------------- 참가하기로 한 명단 --------------------");
        for (String name : players) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static Map<String, List<String>> savePlayersProfile(List<String> players) {
        // 등급, 선수종류, 주사위 숫자, 등급 점수, 플레이어 주사위 등금 점수 합
        Map<String, List<String>> allPlayersStorage = new HashMap<>();
        for (String player : players) {
            allPlayersStorage.put(player, registerPlayerProfile(player));
        }
        return allPlayersStorage;
    }

    public static List<String> registerPlayerProfile(String rank) {
        List<String> playerProfile = new ArrayList<>();
        System.out.print(rank + " 랭크 입력 : ");
        playerProfile.add(SCANNER.next());
        playerProfile.add("일반선수");
        playerProfile.add(addRandomDiceNumberProfile());
        playerProfile.add(rank);
        playerProfile.set(3, findByRating(playerProfile));
        playerProfile.add(addPlayersGradeTotal(playerProfile));
        return playerProfile;
    }

    public static String addRandomDiceNumberProfile() {
        return String.valueOf(RANDOM.nextInt(6) + 1);
    }

    public static String findByRating(List<String> players) {
        if (players.get(0).equals("A") || players.get(0).equals("a")) {
            return "3";
        }
        if (players.get(0).equals("B") || players.get(0).equals("b")) {
            return "2";
        }
        if (players.get(0).equals("C") || players.get(0).equals("c")) {
            return "1";
        }
        return "해당하는 랭크가 없습니다.";
    }

    public static void validateGrade(Map<String, List<String>> allPlayers) {
        for (List<String> playerRank : allPlayers.values()) {
            if (!playerRank.get(0).equals("A") && !playerRank.get(0).equals("a")
                    && !playerRank.get(0).equals("B") && !playerRank.get(0).equals("b")
                    && !playerRank.get(0).equals("C") && !playerRank.get(0).equals("c")) {
                throw new IllegalArgumentException("올바른 랭크를 입력하지 않았습니다.");
            }
        }
    }

    public static String addPlayersGradeTotal(List<String> players) {
        int totalRating = Integer.parseInt(players.get(2)) + Integer.parseInt(players.get(3));
        return String.valueOf(totalRating);
    }

    public static Map<String, List<String>> dividePlayersByATeam(Map<String, List<String>> allPlayers) {
        Map<String, List<String>> ATeamPlayers = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> player : allPlayers.entrySet()) {
            if (ATeamPlayers.size() < 6) {
                ATeamPlayers.put(player.getKey(), player.getValue());
            }
        }
        return ATeamPlayers;
    }

    public static Map<String, List<String>> dividePlayersByBTeam(Map<String, List<String>> allPlayers, Map<String, List<String>> ATeam) {
        Map<String, List<String>> BTeamPlayers = new LinkedHashMap<>();
        for (Map.Entry<String, List<String>> player : allPlayers.entrySet()) {
            if (!ATeam.containsKey(player.getKey())) {
                BTeamPlayers.put(player.getKey(), player.getValue());
            }
        }
        return BTeamPlayers;
    }

    public static int findATeamRankTotalScore(Map<String, List<String>> ATeams) {
        int ATeamRankTotalScore = 0;
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            if (ATeam.getValue().get(0).equals("A") || ATeam.getValue().get(0).equals("a")) {
                ATeamRankTotalScore += 3;
            }
            if (ATeam.getValue().get(0).equals("B") || ATeam.getValue().get(0).equals("b")) {
                ATeamRankTotalScore += 2;
            }
            if (ATeam.getValue().get(0).equals("C") || ATeam.getValue().get(0).equals("c")) {
                ATeamRankTotalScore += 1;
            }
        }
        return ATeamRankTotalScore;
    }

    public static int findBTeamRankTotalScore(Map<String, List<String>> BTeams) {
        int BTeamRankTotalScore = 0;
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (BTeam.getValue().get(0).equals("A") || BTeam.getValue().get(0).equals("a")) {
                BTeamRankTotalScore += 3;
            }
            if (BTeam.getValue().get(0).equals("B") || BTeam.getValue().get(0).equals("b")) {
                BTeamRankTotalScore += 2;
            }
            if (BTeam.getValue().get(0).equals("C") || BTeam.getValue().get(0).equals("c")) {
                BTeamRankTotalScore += 1;
            }
        }
        return BTeamRankTotalScore;
    }

    public static boolean isHigherScoreTeam(int ATeamRankScore, int BTeamRankScore) {
        if (ATeamRankScore == BTeamRankScore) {
            return false;
        }
        if (BTeamRankScore > ATeamRankScore && BTeamRankScore - ATeamRankScore == 1 || BTeamRankScore - ATeamRankScore == 2) {
            return false;
        }
        return (BTeamRankScore <= ATeamRankScore || BTeamRankScore - ATeamRankScore != 1) && BTeamRankScore - ATeamRankScore != 2;
    }

    public static boolean isDeleteAllTeamsPlayers(boolean teamSelect, Map<String, List<String>> ATeamPlayers,
                                                  Map<String, List<String>> BTeamPlayers) {
        if (!teamSelect) {
            return false;
        }
        ATeamPlayers.clear();
        BTeamPlayers.clear();
        return true;
    }

    public static void printAllTeamsScore(int ATeamTotalRankScore, int BTeamTotalRankScore) {
        System.out.println("A 팀 랭크 스코어 합계 : " + ATeamTotalRankScore);
        System.out.println("B 팀 랭크 스코어 합계 : " + BTeamTotalRankScore + "\n");
    }

    public static void printATeamPlayerList(Map<String, List<String>> ATeams) {
        System.out.print("ATeamPlayer : ");
        for (String ATeamPlayer : ATeams.keySet()) {
            System.out.print(ATeamPlayer + " ");
        }
        System.out.println();
    }

    public static void printBTeamPlayerList(Map<String, List<String>> BTeams) {
        System.out.print("BTeamPlayer : ");
        for (String BTeamPlayer : BTeams.keySet()) {
            System.out.print(BTeamPlayer + " ");
        }
        System.out.println();
    }

    public static List<String> findATeamBestPlayer(Map<String, List<String>> ATeams) {
        List<String> bestPlayers = new ArrayList<>();
        int firstForward = 0;
        int secondForward = 0;
        int max = 0;
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            max = Math.max(max, Integer.parseInt(ATeam.getValue().get(4))); // 최대값 구했어
            bestPlayers.add(findATeamEqualsBestGrade(firstForward, ATeam.getKey()));
        }
        return bestPlayers;
    }

    public static String findATeamEqualsBestGrade(int firstForward, String ATeamPlayerName) {
        String playerName = "";
        if (firstForward == 2) {
            playerName = ATeamPlayerName;
        }
        return playerName;
    }

    public static Map<String, List<String>> addATeamForward(Map<String, List<String>> ATeams, List<String> playerNames) {
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            if (playerNames.contains(ATeam.getKey())) {
                ATeam.getValue().set(1, "공격수");
                ATeams.put(ATeam.getKey(), ATeam.getValue());
            }
        }
        return ATeams;
    }

    public static List<String> findBTeamBestPlayer(Map<String, List<String>> BTeams) {
        List<String> bestPlayers = new ArrayList<>();
        int forwardCount = 0;
        int max = 0;
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (max < Integer.parseInt(BTeam.getValue().get(4))) {
                max = Integer.parseInt(BTeam.getValue().get(4));
                forwardCount++;
            }
            bestPlayers.add(findBTeamEqualsBestGrade(forwardCount, BTeam.getKey()));
        }
        return bestPlayers;
    }

    public static String findBTeamEqualsBestGrade(int forwardCount, String BTeamPlayerName) {
        String playerName = "";
        if (forwardCount == 2) {
            playerName = BTeamPlayerName;
        }
        return playerName;
    }

    public static Map<String, List<String>> addBTeamForward(Map<String, List<String>> BTeams, List<String> playerNames) {
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            if (playerNames.contains(BTeam.getKey())) {
                BTeam.getValue().set(1, "공격수");
                BTeams.put(BTeam.getKey(), BTeam.getValue());
            }
        }
        return BTeams;
    }

    public static void printATeamPlayers(Map<String, List<String>> ATeams) {
        for (Map.Entry<String, List<String>> ATeam : ATeams.entrySet()) {
            System.out.println("A 팀 : " + ATeam.getKey() + " " + ATeam.getValue());
        }
        System.out.println("==================================");
    }

    public static void printBTeamPlayers(Map<String, List<String>> BTeams) {
        for (Map.Entry<String, List<String>> BTeam : BTeams.entrySet()) {
            System.out.println("B 팀 : " + BTeam.getKey() + " " + BTeam.getValue());
        }
    }

}





