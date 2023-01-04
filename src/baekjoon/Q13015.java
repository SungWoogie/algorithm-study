//package baekjoon;
//
//import java.util.Scanner;
//
//public class Q13015 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n * 2; j++) {
//                System.out.print("*");
//                for (int k = 0; k < n * 2 - 3; k++) {
//                    System.out.print(" ");
//                }
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < 1; i++) { // 가운데 줄
//            for (int j = 0; j < n - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 3; j++) {
//                System.out.print("*");
//                for (int k = 0; k < n - 3 + 1; k++) {
//                    System.out.print(" ");
//                }
//            }
//
//        }
//
//        for (int i = 0; i < n - 1; i++) {
//
//        }
//    }
//}
