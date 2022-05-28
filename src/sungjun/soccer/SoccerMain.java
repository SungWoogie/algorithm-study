package sungjun.soccer;

import java.util.Scanner;

public class SoccerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("어서오세요. 나이스토토 입니다.");
        System.out.println("구입 할 팀을 선택해주세요");
        Team[] team = Team.values();
        for (Team teamName : team) {
            System.out.print("[" + teamName + "]" + " ");
        }
        String str = scanner.next();

    }

}
