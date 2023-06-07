package zerobase;

import java.util.*;

public class MiniTask_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<Integer>> coordinates = new HashMap<>();

        System.out.print("내 좌표 x값을 입력해 주세요: ");
        int myX = scanner.nextInt();
        System.out.print("내 좌표 y값을 입력해 주세요: ");
        int myY = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "/10 번째 입력");
            System.out.print("임의의 좌표 x값을 입력해 주세요: ");
            int x = scanner.nextInt();
            System.out.print("임의의 좌표 y값을 입력해 주세요: ");
            int y = scanner.nextInt();

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

        System.out.println("좌표 목록:");
        for (Map.Entry<Integer, List<Integer>> entry : coordinates.entrySet()) {
            int x = entry.getKey();
            List<Integer> yList = entry.getValue();

            for (int y : yList) {
                double distance = calculateDistance(myX, myY, x, y);
                System.out.printf("(%d, %d) => %.6f\n", x, y, distance);
            }
        }

        System.out.println("제일 가까운 좌표:");
        double minDistance = Double.MAX_VALUE;
        int closestX = 0;
        int closestY = 0;

        for (Map.Entry<Integer, List<Integer>> entry : coordinates.entrySet()) {
            int x = entry.getKey();
            List<Integer> yList = entry.getValue();

            for (int y : yList) {
                double distance = calculateDistance(myX, myY, x, y);
                if (distance < minDistance) {
                    minDistance = distance;
                    closestX = x;
                    closestY = y;
                }
            }
        }

        System.out.printf("(%d, %d) => %.6f\n", closestX, closestY, minDistance);
    }

    private static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}