package test;

import java.util.*;

public class Futsal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("풋살에 참가할 참가자 이름을 입력해주세요.");
        List<String> players = List.of(scanner.nextLine().split(" "));

        Set<String> tempATeams = new HashSet<>(players);
        Set<String> tempBTeams = new LinkedHashSet<>();

        System.out.println();
        System.out.println("--------------- 참가하기로 한 명단 ---------------");
        System.out.println(players + "\n");

        // 랜덤으로 인덱스 뽑아서 선수 넣기
        boolean BTeamPersonnel = true;
        while (BTeamPersonnel) {
            for (String ATeam : tempATeams) {
                if (tempBTeams.size() == 6) {
                    BTeamPersonnel = false;
                    break;
                }
                tempBTeams.add(ATeam);
            }
        }

        // 같은 선수 A 팀에서 제거 하기 로직 추가
        for (String BTeam : tempBTeams) {
            tempATeams.remove(BTeam);
        }
        List<String> ATeams = new ArrayList<>(tempATeams);
        List<String> BTeams = new ArrayList<>(tempBTeams);

        System.out.println("A팀 : " + ATeams);
        System.out.println("B팀 : " + BTeams);
        System.out.println();

        // 공격수 뽑기
        Map<String, Boolean> aTeams = new HashMap<>();
        Map<String, Boolean> bTeams = new HashMap<>();

        for (int i = 0; i < ATeams.size(); i++) {
            aTeams.put(ATeams.get(i), false);
            bTeams.put(BTeams.get(i), false);
        }

        int aTeamForwardCount = 0;
        while (aTeamForwardCount != 2) { // A 팀 공격수 뽑기
            for (Map.Entry<String, Boolean> aTeam : aTeams.entrySet()) {
                if (random.nextInt(10) + 1 > 5) {
                    aTeams.put(aTeam.getKey(), true);
                    aTeamForwardCount++;
                }
                if (aTeamForwardCount == 2) {
                    break;
                }
            }
        }
        int bTeamForwardCount = 0;
        while (bTeamForwardCount != 2) { // B 팀 공격수 뽑기
            for (Map.Entry<String, Boolean> bTeam : bTeams.entrySet()) {
                if (random.nextInt(10) + 1 > 5) {
                    bTeams.put(bTeam.getKey(), true);
                    bTeamForwardCount++;
                }
                if (bTeamForwardCount == 2) {
                    break;
                }
            }
        }
        System.out.println("A 팀 공격수 확인 : " + aTeams);
        System.out.println("B 팀 공격수 확인 : " + bTeams + "\n");

        // 공격수 담기 순차적으로 나오면 안되어 Set 에 담기
        Set<String> forwards = new HashSet<>();
        for (Map.Entry<String, Boolean> aForward : aTeams.entrySet()) {
            if (aForward.getValue()) {
                forwards.add(aForward.getKey());
            }
        }
        for (Map.Entry<String, Boolean> bForward : bTeams.entrySet()) {
            if (bForward.getValue()) {
                forwards.add(bForward.getKey());
            }
        }

        int aScore = 0;
        int bScore = 0;
        for (String set : forwards) { // 출력 랜덤 5 이상이면 득점 부분 출력
            int goal = random.nextInt(10) + 1;
            if (aTeams.containsKey(set)) {
                if (goal > 5) {
                    aScore++;
                    System.out.println(set + " : A 팀 공격수 득점에 성공하였습니다." + "\n");
                } else {
                    System.out.println(set + " : A 팀 공격수 어림 없는 볼." + "\n");
                }
            } else {
                if (goal > 5) {
                    bScore++;
                    System.out.println(set + ": B 팀 공격수 득점에 성공하였습니다." + "\n");
                } else {
                    System.out.println(set + " : B 팀 공격수 어림 없는 볼." + "\n");
                }
            }
        }

        if (aScore > bScore) { // 결과
            System.out.println("A 팀이 " + aScore + " 대 " + bScore + " 으로 이겼습니다.");
        } else if (aScore < bScore) {
            System.out.println("B 팀이 " + bScore + " 대 " + aScore + " 으로 이겼습니다.");
        } else {
            System.out.println(aScore + " 대 " + bScore + " 으로 비겼습니다.");
        }
        // 성욱 성준 준성 상국 황두 인기 기강 현진 상준 영수 상훈 성규
    }
}
