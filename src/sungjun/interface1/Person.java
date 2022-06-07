package sungjun.interface1;

public class Person implements Creature {
    @Override
    public void method() {
        System.out.println("인터페이스 Creature 구현한 Person 메소드 호출");
    }

    public void method1() {
        System.out.println("Person 클래스에 있는 멤버 메소드 호출");
    }
}
