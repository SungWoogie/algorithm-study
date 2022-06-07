package sungjun.animal3;

public class Dog implements Animal {

    private final String name;
    private int speed;

    public Dog(String name, int speed) {
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
        System.out.println("강아지 스피드를 올립니다.");

    }

    @Override
    public void speedDown() {
        speed--;
        System.out.println("강아지 스피드를 내립니다.");
    }

}
