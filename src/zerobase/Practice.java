package zerobase;

class Car {
    public Car() {
    }
    public void horn() {
        System.out.println("빵빵");
    }
}

class FireTruck extends Car{
    public void horn() {
        System.out.println("위잉");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀");
    }
}

public class Practice {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();
        car = new FireTruck();
        car.horn();
        car = new Ambulance();
        car.horn();

    }
}
