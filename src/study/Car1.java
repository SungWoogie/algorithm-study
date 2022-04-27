package study;

public class Car1 {

    private String name;
    private int position;

    public Car1(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            int position = (int) (Math.random() * 10);
            System.out.println(position);
        }
    }
}
