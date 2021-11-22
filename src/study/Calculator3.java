package study;

import java.util.*;
// 2021.11.12 3번째 실패
public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
        List<Integer> numList1 = new LinkedList<>();

        String plus = "+";
        String minus = "-";
        String multiply = "*";
        String divide = "/";

        String str = scanner.nextLine();
        String[] value = str.split(" ");

        for (int i = 0; i < str.length(); i++) {

            if (!list.contains(value[i])) {
                numList1.add(Integer.parseInt(value[i]));
            }
            int result = 0;

            if (list.get(i).equals(plus)) {
                result = numList1.get(0) + numList1.get(1);
            } else if (list.get(i).equals(minus)) {
                result = numList1.get(0) + numList1.get(1);
            } else if (list.get(i).equals(multiply)) {
                result = numList1.get(0) + numList1.get(1);
            } else if (list.get(i).equals(divide)) {
                result = numList1.get(0) + numList1.get(1);
            }
            System.out.println(result);
        }
    }
}



