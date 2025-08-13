package extends1.ex2;

// Car의 기능을 물려받음
public class ElectricCar extends Car{
                        // (->)
    public void charge(){
        System.out.println("충전합니다.");
    }
}
