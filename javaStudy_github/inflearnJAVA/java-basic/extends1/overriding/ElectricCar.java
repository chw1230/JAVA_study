package extends1.overriding;

// Car의 기능을 물려받음
public class ElectricCar extends Car {
                        // (->)
    @Override // 새로운 기능을 재정의
    public void move(){
        System.out.println("전기차를 삐르게 이동합니다.");
    }

    public void charge(){
        System.out.println("충전합니다.");
    }
}
