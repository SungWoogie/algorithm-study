package test;

public class ZeroBaseTest_2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();

    }

}

class Animals {
    String desc;

    Animals() {
        this.desc = "동물 클래스입니다.";
    }

    Animals(String desc) {
        this.desc = desc;
    }

    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animals {
    String desc;

    Cat() {
//        super.desc = "고양이 입니다.";
        super("고양이 입니다.");

    }

}


