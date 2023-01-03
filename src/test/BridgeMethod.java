package test;

import java.util.*;

public class BridgeMethod {

    private static final String SUCCESS = "성공";
    private static final String FAIL = "실패";
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final Map<String, Integer> map = new HashMap<>();

    static {
        map.put("aboveCount", 0);
        map.put("failCount", 0);
        map.put("underCount", 0);
    }

    public static void main(String[] args) {
        printGameStartMessage();
        int bridgeLength = inputBridgeLength();
        List<Integer> randomNumbers = createRandomNumber(bridgeLength);
        boolean isReplay = true;
        int totalAttemptCount = 0;
        while (isReplay) {
            int aboveOCount = 0;
            int underOCount = 0;
            int failCount = 0;

            totalAttemptCount++;
            isReplay = false;
            StringBuilder aboveBridge = new StringBuilder("[");
            StringBuilder underBridge = new StringBuilder("[");
            List<String> aboveList = new ArrayList<>();
            List<String> underList = new ArrayList<>();

            for (int i = 0; i < bridgeLength; i++) {
                String move = moveZoneSelect();
                Map<String, Integer> countRepository = repeatSelectBridge(move, i, randomNumbers, aboveList, underList, failCount, aboveOCount, underOCount);
                aboveOCount = countRepository.get("aboveCount");
                underOCount = countRepository.get("underCount");
                failCount = countRepository.get("failCount");
                addBracket(aboveBridge, underBridge, i, aboveList, underList);
                printResult(aboveBridge, underBridge);
                if (compareFailCount(countRepository)) {
                    break;
                }
                changeBracketToStick(aboveBridge, underBridge);
                System.out.println();
            }
            isReplay = findFinalResult(aboveOCount, underOCount, bridgeLength, aboveBridge, underBridge, totalAttemptCount);
        }
    }

    public static void printGameStartMessage() {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
    }

    public static int inputBridgeLength() {
        System.out.println("다리 길이를 입력해주세요.");
        return SCANNER.nextInt();
    }

    public static List<Integer> createRandomNumber(int bridgeLength) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < bridgeLength; i++) {
            randomNumbers.add(RANDOM.nextInt(2));
        }
        return randomNumbers;
    }

    public static Map<String, Integer> repeatSelectBridge(String move, int i, List<Integer> randomNumbers,
                                                          List<String> aboveList, List<String> underList, int failCount,
                                                          int aboveOCount, int underOCount) {
        Map<String, Integer> aboveCountUnderCountFailCountRepository = map;
        if (isSelectAboveBridge(move)) {
            if (isRandomNumberEqualsToOne(randomNumbers, i)) {
                addAboveListToO(aboveList);
                addUnderListToBlank(underList);
                aboveCountUnderCountFailCountRepository.put("aboveCount", addAboveOCount(aboveOCount));
            }
            addAboveToX(aboveList);
            addUnderListToBlank(underList);
            aboveCountUnderCountFailCountRepository.put("failCount", addFailCount(failCount));
        }
        if (isSelectUnderBridge(move)) {
            if (!isRandomNumberEqualsToOne(randomNumbers, i)) {
                addUnderListToO(underList);
                addAboveListBlank(aboveList);
                aboveCountUnderCountFailCountRepository.put("underCount", addUnderOCount(underOCount));
            }
            addUnderListToX(underList);
            addAboveListBlank(aboveList);
            aboveCountUnderCountFailCountRepository.put("failCount", addFailCount(failCount));
        }
        return aboveCountUnderCountFailCountRepository;
    }

    public static String moveZoneSelect() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        return SCANNER.next();
    }

    public static boolean isSelectAboveBridge(String selectBridge) {
        return selectBridge.equals("U");
    }

    public static boolean isRandomNumberEqualsToOne(List<Integer> randomNumbers, int i) {
        return randomNumbers.get(i) == 1;
    }

    public static void addAboveListToO(List<String> tempAboveLists) {
        tempAboveLists.add(" O ");
    }

    public static void addUnderListToBlank(List<String> tempUnderLists) {
        tempUnderLists.add("   ");
    }

    public static int addAboveOCount(int aboveOCount) {
        return aboveOCount + 1;
    }

    public static void addAboveToX(List<String> tempAboveLists) {
        tempAboveLists.add(" X ");
    }

    public static int addFailCount(int failCount) {
        return failCount + 1;
    }

    public static boolean isSelectUnderBridge(String selectBridge) {
        return selectBridge.equals("D");
    }

    public static void addUnderListToO(List<String> tempUnderLists) {
        tempUnderLists.add(" O ");
    }

    public static void addAboveListBlank(List<String> tempAboveLists) {
        tempAboveLists.add("   ");
    }

    public static int addUnderOCount(int UnderOCount) {
        return UnderOCount + 1;
    }

    public static void addUnderListToX(List<String> tempUnderLists) {
        tempUnderLists.add(" X ");
    }

    public static void addBracket(StringBuilder aboveBuilder, StringBuilder underBuilder, int i
            , List<String> aboveList, List<String> underList) {
        aboveBuilder.append(aboveList.get(i)).append("]");
        underBuilder.append(underList.get(i)).append("]");
    }

    public static void printResult(StringBuilder aboveBuilder, StringBuilder underBuilder) {
        System.out.println(aboveBuilder);
        System.out.println(underBuilder);
    }

    public static boolean compareFailCount(Map<String, Integer> totalRepository) {
        return totalRepository.get("failCount") > 0;
    }

    public static void changeBracketToStick(StringBuilder aboveBuilder, StringBuilder underBuilder) {
        aboveBuilder.deleteCharAt(aboveBuilder.length() - 1);
        underBuilder.deleteCharAt(underBuilder.length() - 1);
        aboveBuilder.append("|");
        underBuilder.append("|");
    }

    public static boolean findFinalResult(int aboveOCount, int underOCount, int bridgeLength,
                                          StringBuilder aboveBridge, StringBuilder underBridge, int totalAttemptCount) {
        if (aboveOCount + underOCount == bridgeLength) {
            printSuccessCaseFinalResult(aboveBridge, underBridge, totalAttemptCount);
        }
        return isInputRetry(aboveBridge, underBridge, totalAttemptCount);
    }

    public static void printSuccessCaseFinalResult(StringBuilder aboveBuilder, StringBuilder underBuilder,
                                                   int totalAttemptCount) {
        System.out.println("최종 게임 결과");
        changeStickToBracket(aboveBuilder, underBuilder);
        printResult(aboveBuilder, underBuilder);
        System.out.println();
        System.out.println("게임 성공 여부: " + SUCCESS);
        System.out.println("총 시도한 횟수: " + totalAttemptCount);

    }

    public static void changeStickToBracket(StringBuilder aboveBuilder, StringBuilder underBuilder) {
        aboveBuilder.deleteCharAt(aboveBuilder.length() - 1);
        underBuilder.deleteCharAt(underBuilder.length() - 1);
        aboveBuilder.append("]");
        underBuilder.append("]");
    }

    public static boolean isInputRetry(StringBuilder aboveBuilder, StringBuilder underBuilder, int totalAttemptCount) {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        if (SCANNER.next().equals("R")) {
            return true;
        }
        printFailCaseFinalResult(aboveBuilder, underBuilder, totalAttemptCount);
        return false;
    }

    public static void printFailCaseFinalResult(StringBuilder aboveBuilder, StringBuilder underBuilder, int totalAttemptCount) {
        System.out.println();
        System.out.println("최종 게임 결과");
        System.out.println(aboveBuilder);
        System.out.println(underBuilder);
        System.out.println();
        System.out.println("게임 성공 여부: " + FAIL);
        System.out.println("총 시도한 횟수: " + totalAttemptCount);
    }

}
