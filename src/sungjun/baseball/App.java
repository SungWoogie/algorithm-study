package sungjun.baseball;

public class App {

    public static void main(String[] args) {
        try {
            Manager baseballManager = new Manager();
            baseballManager.runBaseballGame();
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("알수 없는 예외가 발생하였습니다.");
        }
    }

}
