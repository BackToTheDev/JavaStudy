package week04.sample01;

public class OurClass {

    private final boolean just = true;

    //throws : 던지다(예외를 던지다 / 발생시키다)
    public void thisMethodIsDangerous() throws OurBadException {
        //custom logic
        if (true) {
            throw new OurBadException(); //여기서 new OurBadException을 생성해서 throw가 가능한 이유는 메서드 생성할 때 예외처리를 미리 해줬기 떄문
        }
    }
}
