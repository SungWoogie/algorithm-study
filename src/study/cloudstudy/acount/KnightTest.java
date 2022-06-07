package study.cloudstudy.acount;

public class KnightTest {
    public static void main(String[] args) {

        Knight knight = new Knight("돈키호테", 30);

        System.out.println("[객체 생성]");
        System.out.printf("Knight { name: %s, hp: %d }\n", knight.getName(), knight.getHp());

        knight.setHp(30);

        System.out.println("[체력 증가 +30]");
        System.out.printf("Knight { name: %s, hp: %d }", knight.getName(), knight.getHp());

    }
}
