package week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        //try ~ catch ~ finally 구문
        //try : 시도하다
        // catch : 잡다(붙잡다)
        // fianlly 마침내

        //일단 try해 ~~ 그리고, 예외가 발생하면 그걸 잡아(catch)
        // 그리고, 정상적으로 수행하던, 예외가 발생하던, 수행해야하는 로직을 finally로 수행해.
        try {
            //일단 실행
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            // 오류가 나던 안나던 이 구문은 반드시 거쳐간다.
            System.out.println("우리는 예외를 handling 했습니다. 정상처리되든, 안되든 일단 거쳐감");
        }

    }
}
