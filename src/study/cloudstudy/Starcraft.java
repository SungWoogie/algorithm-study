package study.cloudstudy;

public class Starcraft {
    public static void main(String[] args) {
        // 객체 생성
        Marin marin = new Marin("레이너", 80);
        Medic medic = new Medic("모랄레스", 60, 60);

        // 마린의 스팀팩
        marin.stimpack();
        // 메딕의 힐
        medic.heal(marin);

    }
}

class Marin {

    String name;
    int hp;

    public Marin(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void stimpack() {
        System.out.printf("[%s]의 스팀팩! HP: %d -> %d\n", this.name, this.hp, this.hp -= 10);

    }
}

class Medic {

    String name;
    int hp;
    int mp;

    public Medic(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void heal(Marin marin) {
        System.out.printf("[%s]의 치유! => [%s] HP(%d -> %d)\n", this.name, marin.name, marin.hp, marin.hp += 10);

    }

}
