package exception.basic.unchecked;

//RuntimeException을 상속받은 애들은 언체크 예외
public class MyUncheckedException extends RuntimeException{

    public MyUncheckedException(String message) {
        super(message);
    }
}
