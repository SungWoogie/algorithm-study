package baseballGame;

import java.util.List;

public class test {
    public static void main(String[] args) {
        String str = Input.inputNumber();

        List<Integer> list = Com.컴퓨터숫자생성();

        for (int i : list) {
            System.out.println(i + " ");
        }
    }

}
