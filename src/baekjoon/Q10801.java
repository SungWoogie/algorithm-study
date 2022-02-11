package baekjoon;

import java.util.Scanner;

public class Q10801 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        int[] aArr = new int[10];
//        int[] bArr = new int[10];
//        for (int i = 0; i < aArr.length; i++) {
//            aArr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < bArr.length; i++) {
//            bArr[i] = scanner.nextInt();
//        }
//        int aCount = 0;
//        int bCount = 0;
//
//        for (int i = 0; i < aArr.length; i++) {
//            if (aArr[i] > bArr[i]) {
//                aCount++;
//            } else if (aArr[i] < bArr[i]) {
//                bCount++;
//            }
//        }
//        if (aCount > bCount) {
//            System.out.println("A");
//        } else if (aCount < bCount) {
//            System.out.println("B");
//        } else {
//            System.out.println("D");
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] aStr = scanner.nextLine().split(" ");
        String[] bStr = scanner.nextLine().split(" ");

        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < 10; i++) {
            int aNum = Integer.parseInt(aStr[i]);
            int bNum = Integer.parseInt(bStr[i]);

            if (aNum > bNum) {
                aCount++;
            } else if (aNum < bNum) {
                bCount++;
            }
        }
        if (aCount > bCount) {
            System.out.println("A");
        } else if (aCount < bCount) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}
