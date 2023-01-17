package test;

import java.util.*;

public class FutsalMethod {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<String> participationNames = inputFutsalParticipationNames();
        printParticipationList(participationNames);

        Map<String, List<String>> playersProfile = savePlayersProfile(participationNames);

        Map<String, List<String>> ATeams = new LinkedHashMap<>();
        Map<String, List<String>> BTeams = new LinkedHashMap<>();

        Boolean isTeamSelect = true;
        while (isTeamSelect) {

        }

    }

    public static List<String> inputFutsalParticipationNames() {
        System.out.println("풋살에 참가할 참가자 이름을 입력해주세요.");
        List<String> players = new ArrayList<>(List.of(SCANNER.nextLine().split(" ")));
        Collections.shuffle(players);
        return players;
    }

    public static void printParticipationList(List<String> players) {
        System.out.println();
        System.out.println("-------------------- 참가하기로 한 명단 --------------------");
        for (String name : players) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static Map<String, List<String>> savePlayersProfile(List<String> players) {
        // 등급, 선수종류, 주사위 숫자, 등급 점수
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

    public static Map<String, List<String>> divideTeams(Map<String,List<String>> players, Map<String,List<String>> aTeam,
                                                        Map<String,List<String>> bTeam) {
        for (Map.Entry<String, List<String>> player : players.entrySet()) {
            if (bTeam.size() < 6) {
                bTeam.put(player.getKey(), player.getValue());
                allPlayersStorage123123.remove(tempAllPlayer.getKey(), tempAllPlayer.getValue());
                ATeams = allPlayersStorage123123;
            }
        }
    }

}





