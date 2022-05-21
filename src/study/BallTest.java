package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            balls.add(new Ball(scanner.next(), scanner.nextInt()));
        }
        Balls balls1 = new Balls(balls);

        for (int i = 0; i < balls1.getBalls().size(); i++) {
                StringBuilder sb = new StringBuilder();
            for (int j = 0; j < balls1.getBalls().get(i).getBallCount(); j++) {
                    sb.append("O");
            }
            System.out.println(balls.get(i).getName() + ": " + sb);
        }

    }
}

class Ball {

    private final String name;
    private final int ballCount;

    public Ball(String name, int ballCount) {
        this.name = name;
        this.ballCount = ballCount;
    }

    public String getName() {
        return name;
    }

    public int getBallCount() {
        return ballCount;
    }
}

class Balls {
    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
