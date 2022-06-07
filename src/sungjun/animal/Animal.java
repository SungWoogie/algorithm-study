package sungjun.animal;

public abstract class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void eat();

    public abstract void attack();


}
