package zerobase;

interface School {
    int MAX_CLASS = 20;
    int MAX_PERSON_PER_CLASS = 40;

    void printSchool();

}

abstract class School1 {
    abstract void printSchool2();
}

class Student extends School1 implements School {


    @Override
    void printSchool2() {

    }

    @Override
    public void printSchool() {

    }
}


public class Practice1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.printSchool();
        System.out.println(student.MAX_CLASS + 30);
    }
}