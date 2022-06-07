package sungjun.animal3;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat("나비", 10);
        Animal dog = new Dog("초코", 10);

        cat.speedUp();
        cat.speedDown();

        dog.speedDown();
        dog.speedUp();

    }

}
