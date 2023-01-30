package sungjun.baseball;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private static final int NEXT_DEFAULT_NUMBER = 1;
    private static final int USER_NUMBER_MIN_RANGE = 1;
    private static final int USER_NUMBER_MAX_RANGE = 9;
    private static final String USER_NUMBERS_HAS_BLANK = " ";

    private final List<Integer> userNumbers;

    public UserNumber(String userNumber) {
        this.userNumbers = validate(userNumber);
    }

    public int findTotalMatchCount(List<Integer> computerNumber) {
        int total = 0;
        for (int i : computerNumber) {
            if (this.userNumbers.contains(i)) {
                total++;
            }
        }
        return total;
    }

    public int findStrike(List<Integer> computerNumber) {
        int strike = 0;
        for (int i = 0; i < this.userNumbers.size(); i++) {
            if (this.userNumbers.get(i).equals(computerNumber.get(i))) {
                strike++;
            }
        }
        return strike;
    }

    private List<Integer> validate(String userNumber) {
        List<String> tempUserNumbers = divideUserNumbers(userNumber);
        validateUserNumbersSize(tempUserNumbers);
        validateNumberBlank(tempUserNumbers);
        validateNumberOverlap(tempUserNumbers);
        List<Integer> userNumbers = validateUserNumberType(tempUserNumbers);
        validateNumberRange(userNumbers);
        return userNumbers;
    }

    private List<String> divideUserNumbers(String userNumber) {
        return List.of(userNumber.split(""));
    }

    private void validateUserNumbersSize(List<String> tempUserNumbers) {
        if (tempUserNumbers.size() != 3) {
            throw new IllegalArgumentException("입력한 숫자가 3개가 아닙니다.");
        }
    }

    private void validateNumberBlank(List<String> tempUserNumbers) {
        if (tempUserNumbers.contains(USER_NUMBERS_HAS_BLANK)) {
            throw new IllegalArgumentException("입력한 값안에 공백이 포함되어 있습니다.");
        }
    }

    private void validateNumberOverlap(List<String> tempUserNumbers) {
        Set<String> set = new LinkedHashSet<>(tempUserNumbers);
        if (set.size() != 3) {
            throw new IllegalArgumentException("중복되는 값이 있습니다.");
        }
    }

    private List<Integer> validateUserNumberType(List<String> tempUserNumbers) {
        List<Integer> userNumbers = new ArrayList<>();
        try {
            for (String number : tempUserNumbers) {
                userNumbers.add(Integer.parseInt(number));
            }
        } catch (NumberFormatException msg) {
            throw new NumberFormatException("올바른 숫자가 아닙니다.");
        }
        return userNumbers;
    }

    private void validateNumberRange(List<Integer> tempUserNumbers) {
        for (int userNumber : tempUserNumbers) {
            if (userNumber < USER_NUMBER_MIN_RANGE || userNumber > USER_NUMBER_MAX_RANGE) {
                throw new IllegalArgumentException("숫자가 1~9 범위가 아닙니다.");
            }
        }
    }

}
