package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // 자동차라는 추상적인 개념속에 가솔린, 전기 차라는 구체적인 개념이 존재
        // 또한 이동(Move())이라는 공통 기능이 보인다.
        // 이런경우에 상속 관계를 사용하는 것이 효과적이다.
        // 자동차가 부모의 개념
    }
}
