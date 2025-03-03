package week03.parameter;



    // 1. 설계도 선언(클래스 선언)
    // 2. 필드 정의
    // 3. 생성자 생성(객체를 생성하는 방식 정의)
    // 4. 기능(메서드) 정의

import week03.Door;
import week03.Handle;
import week03.Tire;

public class Car {

    // (1) 고유 데이터 영역
     String company; // 자동차 회사

     String model = "Gv80"; // 자동차 모델

     String  color; // 자동차 색

    // (2) 상대 데이터 영역
     double price; // 자동차 가격

     double speed; // 자동차 속도

      char gear; // 기어 상태

     boolean lights = true; // 자동차 조명 상태

    public char getGear() {
        return gear;
    }

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // 처음 객체가 생성될 떄 어떤 로직을 수행하고, 어떤 값이 필수로 들어와야 하는지 정의
    public Car() {
        System.out.println("생성자가 호출되었습니다.");
    }

    // 메서드 영역

    //gasPedal
    //input : km/h
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    //breakPedal
    // input : x
    // output : spped
    double breakPedal() {

        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output : gear;
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    //onOffLight
    // input : x;
    // output : lights(boolean)
    boolean onOff() {
        lights = !lights;
        return lights;
    }

    // horn // 경적
    // input : x
    // output : x
    void horn () {
        System.out.println("빵빵!");
    }

    // 자동차의 속도 ..가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
