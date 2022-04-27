package study;

public class Car {
    private int 포지션;
    private String 이름;

    public Car(String 이름) {
        this.이름 = 이름;
        this.포지션 = 0;
    }

    public void move() {
        this.포지션++;
    }

    public int get포지션() {
        return this.포지션;
    }

    public String get이름() {
        return this.이름;
    }
}
