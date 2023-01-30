package sungjun.baseball;

import static sungjun.baseball.Output.STRIKE_MAX_VALUE;

public class MatchCount {

    public static final int DEFAULT_BALL_NUMBER = 0;
    public static final int DEFAULT_STRIKE_NUMBER = 0;

    private final int strike;
    private final int ball;

    public MatchCount(int containNumberTotalCount, int strike) {
        this.strike = strike;
        this.ball = containNumberTotalCount - strike;
    }

    public boolean isNoneMessage() {
        return this.strike == DEFAULT_STRIKE_NUMBER && this.ball == DEFAULT_BALL_NUMBER;
    }

    public boolean isStrikeMessage() {
        return this.strike > DEFAULT_STRIKE_NUMBER && this.ball == DEFAULT_BALL_NUMBER;
    }

    public boolean isBallMessage() {
        return this.strike == DEFAULT_STRIKE_NUMBER && this.ball > DEFAULT_BALL_NUMBER;
    }

    public boolean isStrikeBallMessage() {
        return this.strike > DEFAULT_STRIKE_NUMBER && this.ball > DEFAULT_BALL_NUMBER;
    }

    public boolean isGameExit() {
        return this.strike == STRIKE_MAX_VALUE;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
