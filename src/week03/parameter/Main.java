package week03.parameter;

public class Main {

    public static void main(String[] args) {
     Car car = new Car();
      
        System.out.println("페달 밟기 전 car.gear = " + car.gear);
      
     //메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOff();
        System.out.println("lights = " + lights);

        System.out.println();
        System.out.println("페달 밟은 후 car.gear = " + car.gear);

        System.out.println();
        car.carSpeeds(100, 80);
        System.out.println();
        car.carSpeeds(100, 80, 200, 145);
    }
}
