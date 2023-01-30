package sungjun.baseball;

public class Output {

    public static final int STRIKE_MAX_VALUE = 3;

    public static void printNumberBaseballGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printNoneMessage() {
        System.out.println("낫싱");
    }

    public static void printStrikeMessage(MatchCount matchCount) {
        System.out.println(matchCount.getStrike() + "스트라이크");
    }

    public static void printBallMessage(MatchCount matchCount) {
        System.out.println(matchCount.getBall() + "볼");
    }

    public static void printStrikeBallMessage(MatchCount matchCount) {
        System.out.println(matchCount.getStrike() + "스트라이크" + " " + matchCount.getBall() + "볼");
    }

    public static void printGameExitMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
