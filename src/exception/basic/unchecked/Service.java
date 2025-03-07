package exception.basic.unchecked;

// Unchecked 예외는 잡거나, 던지지 않아도 된다.
// 예외를 잡지 않으면 자동으로 밖으로 던진다.
public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외를 throws 선언하지 않아도 자동으로 던져준다.
    public void callThrow() {
        client.call();
    }
}
