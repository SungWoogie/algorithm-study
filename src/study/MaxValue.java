package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < user; i++) {
            cars.add(new Car(scanner.next()));
        }

        for (Car car : cars) {
            int a = scanner.nextInt();
            if (a > 4) {
                car.move();
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Car car : cars) {
            if (car.get포지션() > 0) {
                sb.append(car.get이름()+" ");
            }
        }
        System.out.println(sb);
    }

}
