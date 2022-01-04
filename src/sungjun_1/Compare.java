package sungjun_1;

public class Compare { //바퀴 담당하는 클래스

    private int 바퀴;

    public Compare() { //기본 생성자
        this.바퀴 = 4;
    }

    public Compare(int 바퀴) {
        this.바퀴 = 바퀴;
    }


    public int getCount() {
        return this.바퀴;
    }

}
