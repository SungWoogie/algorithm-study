//package study;
//
//import java.util.List;
//
///**
// * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
// */
//public class OutputView {
//
//    public static void printGameStartMsg() {
//        System.out.println("다리 건너기 게임을 시작합니다.");
//    }
//
//
//    /**
//     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
//     * <p>
//     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
//     */
//    public static void printMap(Bridges bridges, List<String> user, int count) {
//        //출력 더 간결하게 만들어보기
//        //기능 분리 하기
//        for (int i = 0; i < 2; i++) {
//
//            System.out.print("[ ");
//            for (int j = 0; j < count; j++) {
//
//                int num = -1;
//
//                if (user.get(j).equals("U")) {
//                    num = 0;
//                }
//                if (user.get(j).equals("D")) {
//                    num = 1;
//                }
//
//
//                String OX = bridges.getBridgeLines().get(i).getBridgeLine().get(j);
//                if (num == i) {
//                    if (OX.equals("O")) {
//                        System.out.print("O");
//                        if (count - 1 != j) {
//                            System.out.print(" | ");
//                        }
//                    } else {
//                        System.out.print("X");
//                        if (count - 1 != j) {
//                            System.out.print(" | ");
//                        }
//                        break;
//                    }
//                } else {
//                    System.out.print(" ");
//                    if (count - 1 != j) {
//                        System.out.print(" | ");
//                    }
//                }
//            }
//            System.out.println(" ]");
//        }
//    }
//
//    /**
//     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
//     * <p>
//     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
//     */
//    public static void printResult(int count, int totalCount) {
//        System.out.println("최종 게임 결과");
//
//        for (int i = 0; i < count; i++) {
//            System.out.println("다리 모양"); //최종 모양 출력 (실패 후 재시도 안할시에도 X까지 출력
//        }
//        System.out.println("게임 성공 여부: " + "성공 또는 실패 객체"); //성공 또는 실패를 객체로 가질지 생각해봐야함
//        System.out.println("총 시도한 횟수: " + totalCount);
//
//    }
//}
