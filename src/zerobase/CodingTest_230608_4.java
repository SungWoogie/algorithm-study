package zerobase;

public class CodingTest_230608_4 {
    public static int solution(int n, int i, int j) {
        return recursion(0, n, i, j);
    }

    public static int recursion(int count, int n, int i, int j) {
        // n = 2 인경우 (2x2) 탈출조건
        if (n == 2) {
            if (i == 0 & j == 1) { //우측 상단
                return count + 1;
            } else if (i == 1 && j == 0) { // 좌측 하단
                return count + 3;
            } else { //우측 하단
                return count + 4;
            }
        }
        // 4개 영역으로 나누어 count offset 계산
        int m = n / 2;
        if (i < m && j >= m) { // 우측상단
            return recursion(count, m, i, j - m);
        } else if (i < m) { // 좌측상단
            count += m * m;
            return recursion(count, m, i, j);
        } else if (j < m) { // 좌측하단
            count += m * m * 2;
            return recursion(count, m, i - m, j);
        } else { // 우측 하단
            count += m * m * 3;
            return recursion(count, m, i - m, j - m);
        }
    }

        public static void main (String[]args){
            System.out.println(solution(4, 1, 3)); // 4
        }
    }
