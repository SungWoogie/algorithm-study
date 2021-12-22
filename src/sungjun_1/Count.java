package sungjun_1;

public class Count {

    public int num;

    public void count() {
        this.num = 0;
    }

    public int sum(int a, int b) {
        for (int i = a; i < b; i++) {
            this.num++;
        }
        return this.num;
    }
}
