package junseong;

//2021.11.23 역방향
public class JunSeong2_Review {
    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = arr.length - 1; i >= 0; i--) { // 역방향 100 - 10
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 6; i >= 0; i--) { // 50 - 10
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 5; i--) { // 100 - 70
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 3; i > 2; i--) { // 80 - 40
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 5; i > 0; i--) { // 60 - 20
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 4; i > 4; i--) { // 70 - 60
            System.out.print(arr[i] + " ");
        }
    }
}