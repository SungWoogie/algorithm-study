package test;

public class Practice {
    public static void main(String[] args) {
        Animal animal1 = new Animal("강아지", 5.0,"포유류");
        Animal animal12 = new Animal("구피", 0.01,"어류");
        animal1.printInfo();
        animal12.printInfo();
    }
}

class Animal {
    private final String name;
    private final double weight;
    private final String type;

    public Animal(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.weight);
        System.out.println(this.type);
    }

    public void printInfo(String date) {
        this.printInfo();
        System.out.println("date" + date);
    }

    public void printInfo(int age) {
        this.printInfo();
        System.out.println("age" + age);
    }

    public void eat() {
        System.out.println("먹다.");
    }

    public void sleep() {
        System.out.println("잠자기");
    }

    public void run() {
        System.out.println("뛰기");
    }

    public void walking() {
        System.out.println("걷다.");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
