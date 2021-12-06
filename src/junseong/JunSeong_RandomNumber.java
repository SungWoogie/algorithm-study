package junseong;

public class JunSeong_RandomNumber {
    public static void main(String[] args) { //무조건 10개만 가능 // 수 제한 10부터 19까지만 가능
        int[] arr = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] countNumber = randomNumber(arr);

        int num = 10;

        for (int a : countNumber) {
            System.out.println();
            System.out.printf("번호 %d : %d", num, a);
            num++;
        }
    }

    public static int[] randomNumber(int[] array) { // 메인에 있는 배열 받은 파라미터
        int[] newArray = new int[10]; // 기존 배열과 신규 배열을 쉽게 비교하기 위해 랜덤 숫자 생성 후 배열에 삽입
        int[] countArray = new int[10]; // 비교한 후 카운트한 값 넣어서 리턴하기 위한 배열 생성

        for (int i = 0; i < array.length; i++) { // 랜덤 숫자 생성 포문
            newArray[i] = (int) (Math.random() * 9 + 10); // 10부터 19까지 10개 랜덤 숫자 생성
        }
        for (int i : newArray) { // 랜덤 숫자 어떻게 나왔는지 확인하기 위한 foreach
            System.out.print(i + " ");
        }
        int count = 0; // 지속적으로 값이 같은지 비교하고 초기화 하여 더하기 위한 저장공간

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) { //고민하기
                if (array[i] == newArray[j]) {
                    count++;
                }
            }
            countArray[i] = count;
            count = 0;
        }
        return countArray;
    }
}
