package sungjun;

public class SungJun3_211203 {
    public static void main(String[] args) {
        int[] removeArr = new int[]{50, 50, 60, 70, 80, 20, 10, 50};
        int[] valueRemoveArr = new int[]{50, 50, 60, 70, 80, 20, 10, 50};

        int index = 0;
        int[] returnArr1 = remove(removeArr, index); // remove 메소드

        int num = 50;
        int[] returnArr2 = valueRemove(valueRemoveArr, num); // valueRemove 메소드

        for (int a : returnArr1) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(returnArr1.length);

        for (int a : returnArr2) {
            System.out.print(a + " ");
        }
    }

    public static int[] remove(int[] arr, int index) { // index 입력 시 그 인덱스 빼고 출력하는 메소드
        int[] newArr = new int[arr.length - 1];

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[count] = arr[i];
                count++;
            }
        }
        return newArr;
    }

    public static int[] valueRemove(int[] arr, int num) {
        int[] newArr = new int[arr.length]; //새로운 배열 만들기 크기는 파라미터로 받은 배열과 동일
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[count] = arr[i];  //지울 값과 다른 값만 새로운 배열에 넣어줌
                count++;
            }
        }

        int[] returnArr = new int[count];

        for (int i = 0; i < returnArr.length; i++) {
            returnArr[i] = newArr[i];
        }
        return returnArr;
    }
}