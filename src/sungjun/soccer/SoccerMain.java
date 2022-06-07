package sungjun.soccer;

import java.util.Random;
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
        System.out.println();
        User user = new User(scanner.next(),scanner.nextInt());

        Boss boss = new Boss();
        for (Team e : Team.values()) {
            if (user.getTeamName().equals(e.name())) {
                if (createRandomNumber() > 3) {
                    user.win(e.getDividend());
                    System.out.println("당첨 : " + user.getAmount());
                } else {
                    boss.receive(user.getAmount());
                    user.lose();
                    System.out.println("실패 : " + user.getAmount());
                }
            }
        }
        System.out.println("사장 수익은 : " + boss.getStrongBox());

    }

    public static int createRandomNumber() {
        return new Random().nextInt(6) + 1;
    }

}


//        1. 팀 목록이 주어짐 - 이넘클래스만들기 (인스턴스 변수로 배당을줌)
//        2. 유저클래스가 new 로 인스턴스화 될 때 팀이름을 스캐너로 입력받아 넘겨주고, 배팅 금액을 같이 스캐너로 받아서 넘겨주자

//        3. 랜덤 숫자 뽑아서 - 랜덤메소드를 메인메소드 밑에 만들어 주자.
//        4. 내가 선택한 팀이 - 유저클래스안에 겟터로 이름을 불러와 이넘클래스에 있는 팀이름과 같은 놈은 찾자 찾으면 해당팀에 배팅률을 받아오자
//        5. 이기면 유저 유저한테 배팅률 넘겨준다 그다음 유저 클래스안에다가 자기자신 배팅금액 곱하기 배팅률 받아서 초기화 해주는 메소드 만들기
// 5-1 지면 유저 클래스안에 배팅금액 0으로 초기화 시키는 메소드 만들어 호출하기
//        6. 사장클래스 - 인스턴스변수로 금고를 가진다. (금고는 유저가 돈을 잃은만큼 +할꺼다)
