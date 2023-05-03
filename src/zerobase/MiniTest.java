package zerobase;

import java.util.Scanner;

public class MiniTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isIntroMessage = true;
        while (isIntroMessage) {
            System.out.println("<<<<[메뉴선택]>>>>");
            System.out.println("1. 회원 관리");
            System.out.println("2. 과목 관리");
            System.out.println("3. 수강 관리");
            System.out.println("4. 결제 관리");
            System.out.println("5. 종료");

            String input = scanner.next();

            switch (input) {
                case "1":
                    System.out.println("회원 관리 메뉴를 선택했습니다.");
                    break;
                case "2":
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                    break;
                case "3":
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                    break;
                case "4":
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                    break;
                case "5":
                    System.out.println("프로그램을 종료 합니다.");
                    isIntroMessage = false;
                    break;
                default:
                    System.out.println("입력한 값이 정확하지 않습니다.");
                    break;
            }
        }
    }
}