package sungjun.interface1;

public class CreatureTest {
    public static void main(String[] args) {

        Member member = new Member();
        member.method();
        member.method1();
        System.out.println("=================================");

        Creature creature = new Member();
        creature.method();
        System.out.println("=================================");

        Person person = new Person();
        person.method();
        person.method1();

        Creature creature1 = new Person();
        creature1.method();

        System.out.println(Creature.MAX);

    }

}
