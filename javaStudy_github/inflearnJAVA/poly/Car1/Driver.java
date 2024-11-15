package poly.Car1;

public class Driver {
    private Car car;

    public void setCar(Car car) { // 부모는 자식을 받을 수 있음을 이용함!!
        System.out.println("자동차를 설정합니다."+car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
