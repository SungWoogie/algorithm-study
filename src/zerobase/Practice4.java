package zerobase;

public class Practice4 {
    public static String solution(char[] strArr, char[] findArr, char[] to) {
        /*
        replace indexOf contains 사용하지 않고 원하는 문자 바꾸기
         */
        int idx = 0;
        StringBuilder replaceStr = new StringBuilder();
        char[] replaceArr = strArr.clone();

        do {

            idx = findIndex(replaceArr, findArr);
            if (idx != -1) {
                for (int i = 0; i < idx; i++) {
                    replaceStr.append(replaceArr[i]);
                }
                for (int i = 0; i < to.length; i++) {
                    replaceStr.append(to[i]);
                }
                for (int i = idx + findArr.length; i < replaceArr.length; i++) {
                    replaceStr.append(replaceArr[i]);
                }
                replaceArr = replaceStr.toString().toCharArray();
                replaceStr = new StringBuilder();
            }
        } while (idx != -1);
        replaceStr = new StringBuilder(new String(replaceArr));
        return replaceStr.toString();
    }

    public static int findIndex(char[] str, char[] find) {
        int index = -1;
        boolean isMatch = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == find[0] && str.length - i >= find.length) {
                isMatch = true;
                for (int j = 1; j < find.length; j++) {
                    if (str[i + j] != find[j]) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";
        char[] strArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strArr, findArr, toArr));

        strArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strArr, findArr, toArr));

    }
}
