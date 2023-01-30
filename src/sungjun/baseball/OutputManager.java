package sungjun.baseball;

public class OutputManager {

    public static void printResult(MatchCount matchCount) {
        if (matchCount.isNoneMessage()) {
            Output.printNoneMessage();
        }
        if (matchCount.isStrikeMessage()){
            Output.printStrikeMessage(matchCount);
        }
        if (matchCount.isBallMessage()) {
            Output.printBallMessage(matchCount);
        }
        if (matchCount.isStrikeBallMessage()) {
            Output.printStrikeBallMessage(matchCount);
        }
    }

}
