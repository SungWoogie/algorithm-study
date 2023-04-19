package zerobase;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice8 {
    public static StringBuffer solution(String input ,String cmd) {
        StringBuffer result = new StringBuffer(input);

        List<String> cmdList = new LinkedList<>(Arrays.asList(cmd.split(" ")));

        int curSor = result.length();
        int cmdIdx = 0;
        while (cmdIdx != cmdList.size()) {
            String cur = cmdList.get(cmdIdx);
            switch (cur) {
                case "L":
                    curSor = Math.max(0, curSor - 1);
                    break;
                case "D":
                    curSor = Math.min(result.length(), curSor + 1);
                    break;
                case "B":
                    if (curSor == 0) {
                        cmdIdx++;
                        continue;
                    }
                    result.delete(curSor - 1, curSor);
                    curSor = Math.max(0, curSor - 1);
                    break;
                case "P":
                    String s = cmdList.get(++cmdIdx);
                    result.insert(curSor, s);
                    curSor += 1;
                    break;
            }
            cmdIdx++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd","P x L P Y"));
        System.out.println(solution("abc","L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a b P c"));
    }
}
