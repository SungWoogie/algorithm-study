package junseong;

public class JunSeong1_211209 {

    public static int[] Overlap(int[] a, int[] b) {
        int count = 0;
        int[] tempArr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    if (tempArr[j] != a[i]) { //추가
                        tempArr[count] = a[i];
                        count++;
                    }
                }
            }
        }
        int[] newArr = new int[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = tempArr[i];
        }
        return newArr;
    }
}
