package zerobase;

import java.util.*;

public class MiniTask_2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("내 좌표 x값을 입력해 주세요.");
        int my_x_coordinates = SCANNER.nextInt();
        System.out.println("내 좌표 y값을 입력해 주세요.");
        int my_y_coordinates = SCANNER.nextInt();

        Map<Integer, List<Integer>> coordinates = new LinkedHashMap<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "/10 번째 입력");
            System.out.println("임의의 좌표 x값을 입력해 주세요.");
            int x = SCANNER.nextInt();
            System.out.println("임의의 좌표 y값을 입력해 주세요.");
            int y = SCANNER.nextInt();

            if (coordinates.containsKey(x) && coordinates.get(x).contains(y)) {
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
                i--;
                continue;
            }
            if (!coordinates.containsKey(x)) {
                coordinates.put(x, new ArrayList<>());
            }
            coordinates.get(x).add(y);
        }

        for (Map.Entry<Integer, List<Integer>> entry : coordinates.entrySet()) {
            int x = entry.getKey();
            List<Integer> yList = entry.getValue();

            for (int y : yList) {
                double distance = calculateDistance(my_x_coordinates, my_y_coordinates, x, y);
                System.out.printf("(%d, %d) => %.6f\n", x, y, distance);
            }
        }
        double minDistance = Integer.MAX_VALUE;
        int distanceX = 0;
        int distanceY = 0;
        for (Map.Entry<Integer, List<Integer>> entry : coordinates.entrySet()) {
            int x = entry.getKey();
            List<Integer> yList = entry.getValue();

            for (int y : yList) {
                double distance = calculateDistance(my_x_coordinates, my_y_coordinates, x, y);
                if (distance < minDistance) {
                    minDistance = distance;
                    distanceX = x;
                    distanceY = y;
                }
            }
        }
        System.out.println("제일 가까운 좌표:");
        System.out.printf("(%d, %d) => %.6f\n", distanceX, distanceY, minDistance);
    }

    private static double calculateDistance(int myX, int myY, int x, int y) {
        return Math.sqrt(Math.pow(x - myX, 2) + Math.pow(y - myY, 2));
    }
}