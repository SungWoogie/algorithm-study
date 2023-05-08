package zerobase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {
    List<Integer> list;

    public MySet() {
        this.list = new ArrayList<>();
    }

    public MySet(int[] arr) {
        this.list = new ArrayList<>();

        for (int num : arr) {
            this.list.add(num);
        }
    }

    // 원소 추가 (중복 x)
    public void add(int x) {
        for (int num : this.list) {
            if (num == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합
    public MySet retainAll(MySet mySet) {
        MySet result = new MySet();
        for (int numA : this.list) {
            for (int numB : mySet.list) {
                if (numA == numB) {
                    result.add(numA);
                }
            }
        }
        return result;
    }

    // 합집합
    public MySet addAll(MySet mySet) {
        MySet result = new MySet();
        for (int numA : this.list) {
            result.add(numA);
        }
        for (int numB : mySet.list) {
            result.add(numB);
        }
        return result;
    }

    // 차집합
    public MySet removeAll(MySet mySet) {
        MySet result = new MySet();
        for (int numA : this.list) {
            boolean flag = false;
            for (int numB : mySet.list) {
                if (numA == numB) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.add(numA);
            }
        }
        return result;
    }

}


class Set_Test {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.add(1);
        mySet.add(1);
        mySet.add(1);
        System.out.println(mySet.list);
        mySet.add(2);
        mySet.add(3);
        System.out.println(mySet.list);

        mySet = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet mySet1 = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("my Set : " + mySet.list);
        System.out.println("my Set1 : " + mySet1.list);

        MySet result = mySet.removeAll(mySet1);
        System.out.println("교집합 : " + result.list);

        result = mySet.addAll(mySet1);
        System.out.println("합집합 : " + result.list);

        result = mySet.removeAll(mySet1);
        System.out.println("차집합 : " + result.list);

    }

}

