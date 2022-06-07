package sungjun.animal3;

public class Cat implements Animal {

    private final String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void speedUp() {
        speed++;
        System.out.println("고양이 스피드를 올립니다.");

    }

    @Override
    public void speedDown() {
        speed--;
        System.out.println("고양이 스피드를 내립니다.");
    }
}
