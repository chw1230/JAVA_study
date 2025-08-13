package poly.Car1;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // k3 차량 설정
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); // Car car = k3Car -> 부모는 자식을 받을 수 있음을 이용
        driver.drive();

        // k3 -> model3 차량 변경
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // model3 -> newCar 차량 변경
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
