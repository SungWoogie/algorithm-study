package sungjun.baseball;

import java.util.List;

public class Manager {

    public void runBaseballGame() {
        Output.printNumberBaseballGameStartMessage();
        boolean startGame = true;
        while (startGame) {
            List<Integer> computerNumber = ComputerNumberFactory.createComputerRandomNumbers();
            continueGameRound(computerNumber);
            startGame = isRetrySelect();
        }
    }

    public void continueGameRound(List<Integer> computerNumber) {
        while (true) {
            UserNumber userNumber = new UserNumber(Input.inputUserNumber());
            MatchCount matchCount = new MatchCount(
                    userNumber.findTotalMatchCount(computerNumber),
                    userNumber.findStrike(computerNumber));
            if (isThreeStrike(matchCount)) {
                break;
            }
            OutputManager.printResult(matchCount);
        }
    }

    public boolean isThreeStrike(MatchCount matchCount) {
        if (matchCount.isGameExit()) {
            Output.printGameExitMessage();
            return true;
        }
        return false;
    }

    public boolean isRetrySelect() {
        return new RestartNumber(Input.inputRestartNumber()).isReStartGame();
    }

}
